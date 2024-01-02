'''

(예제 8-3)
fruits = ['사과','감귤']
count = 3

while count>0:
    fruit = input('어떤 과일을 저장할까요>>>')
    if fruit in fruits:
        print('동일한 과일이 있습니다.')
        continue
    fruits.append(fruit)
    count -= 1
    print('입력이 {}번 남았습니다.'.format(count))

print('5개 과일은 {}입니다.'.format(fruits))

(문제3)
pw = 'qwerty'
count = 5

while count >0:
    password = input('비밀번호를 입력하세요>>>')
    if pw == password:
        print('비밀번호를 맞췄습니다.')
        break
    count -= 1
    print('입력횟수가 {}번 남았습니다.'.format(count))

-for문으로 했을 경우-
for i in range(3)
    pw = input('비밀번호를 입력하세요>>')
    if pw == answer:
        print('맞췄습니다.')
        break

(문제4)
for dan in range(2,10):
    if dan % 2 ==0:
        print()
        continue
    for mul in range(1,10):
        if dan < mul:
            break
        print(f'{dan}X{mul}={dan * mul}')


    - 사용자 함수 -
import functest

num = functest.calc(2,10) #전달연자

print(num)

print(functest.multiCalc(5,5))
print(functest.multiCalc(5,5,5))
print(functest.multiCalc(5,5,5,5))

(예제 11-2)
def coffee_machine(money,pick):
    print('{}원에 {}를 선택하셨습니다.'.format(money,pick))
    menu = {
        '아메리카노': 1000,
        '카페라떼': 1500,
        '카푸치노': 2000
    }
    if pick not in menu:
        print('{}는 판매하지 않습니다.'.format(pick))
        return money,'없는 메뉴'
    elif menu[pick] > money:
        print('{}는 {}원입니다.'.format(pick,menu[pick]))
        return money,'금액 부족'
    else:
        return money - menu[pick],pick
order = input('커피를 선택하세요.(아메리카노, 카페라떼, 카푸치노)>>>')
pay = int(input('얼마를 내시나요?>>>'))

change,coffee = coffee_machine(pay,order)
print(f'잔돈{change},커피{coffee}')

(문제2)
def get_average(marks):
    total = 0
    for item in marks:
        total += marks[item]
        #total += marks.get(item)
    return total / len(marks)

scores = {'국어':90,'영어':80,'수학':85,'과학':85,'사회':70}
average = get_average(scores)
print(f'평균은 {average}점 입니다.')

    - 모듈 -
(문제1)
'''
import random
import time

pot = [n for n in range(1,46)]

jackpot = []
bonusNum = []

for n in range(7):
    random.shuffle(pot)
    pick = pot.pop()
    print(f'{n+1}번째 당첨번호는 {pick}입니다.')
    jackpot.append(pick)
    time.sleep(2)

bonusNum.append(jackpot.pop())
jackpot.sort()

print(f'이번 당첨번호는{jackpot} + {bonusNum}')

