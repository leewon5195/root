"""
List = 수정가능
tuple = 수정 불가능
set = 집합(중복값 X)
---------------------------------
from datetime import*

start = datetime.now()
total = 0
for num in range(1,10000001):
    total += num
end = datetime.now()

elapse = end - start
elapse = elapse.total_seconds()

print('총 합은 {} 입니다.'.format(total))
print('총 {}초가 소요되었습니다.'.format(elapse))

응용예제 1

import random
import time

pot = [n for n in range(1,46)]    #1에서 45사이의 모든 정수를 순서대로 pot 리스트에 저장합니다.
jackpot = []

for n in range(1,7):    #6번 반복
    random.shuffle(pot)   #6개의 숫자를 추출하기 전에 미리 선행해야 할 작업 -> shuffle() , pot 리스트의 내용을 섞는다.
    pick = pot.pop()
    print(f'{n}번째 당첨번호는 {pick}입니다.')  #추출 : pop() -> 기본적으로 맨 마지막 값을 꺼내오고 그 값은 추후 사라진다.
    jackpot.append(pick)
    time.sleep(2)   #time 모듈에 sleep 메서드 호출 - 일시정지

#당첨번호를 정렬하여 리스트 출력
jackpot.sort()
print(f'이번 당첨번호는 {jackpot}입니다.')

응용예제 2
"""
import math
import  random
import time

answer = random.randint(1,100)

print('UpDown 게임을 시작합니다.')
start = time.time()
print(start)

while True: #반복횟수를 가늠할수 없는 경우에 while을 쓴다.
    n = int(input('어떤 값일까요?>>>'))

    if answer == n:
        print('정답입니다.')
        break
    elif answer < n:
        print('Down')
    else:
        print('UP')

end = time.time()

elapse = end - start

print(f'{math.floor(elapse)}초 만에 성공했습니다.')










