"""
buffer_size = 1024  #1024byte = 영어로 1024글자(1024byte = 1kb)

with open('code.mp4','rb') as source: #source는 원본 이라는 객체
    with open('code2.mp4','wb') as copy: #copy는 복사본 이라는 객체
        while True:
            buffer = source.read(buffer_size)
            if not buffer:  #버퍼가 원본에서 더이상 가져올게 없다면
                break
            copy.write(buffer)
print('code.mp4 파일이 복사되었습니다.')

--- csv파일 내용 읽어오기---

student_list = [] #csv 파일의 내용을 읽어서 리스트에 넣기위해 미리 빈 리스트를 생성했다.

#파일입출력 처리를 해야하니까 open을 해야한다.
with open('학생명단.csv','rt') as file:
    file.readline()
    while True:
        line = file.readline()
        if not line:    #line에 값이 없다면
            break
        student = line.split('.')   #읽어온 한 줄을 슬라이싱하여 한개씩 변수에 넣는다.
        student_list.append(student)
print(student_list)

--- csv파일 내용 읽어오기---

member_list = []
with open('회원명단.csv','rt') as file:
    file.readline()
    while True:
        line = file.readline()
        if not line:
            break
        member = line.split(',')
        member[0] = member[0].strip('"')
        member_list.append(member)
print(member_list)

--- csv 파일을 만들어보자 ---

import csv

with open('차량관리.csv','w',newline='') as  file:
    csv_maker = csv.writer(file,delimiter=',')
    # .writerrow() : 해당 파일에 한줄씩 쓰겠다.
    csv_maker.writerow([1,'08러1234','2020-10-20,14:00'])
    csv_maker.writerow([2,'25다1234','2020-10-20,14:10'])
    csv_maker.writerow([3,'28하1234','2020-10-20,14:20'])
print('차량관리.csv파일이 생성되었습니다.')

---문제 1 ---

#1. 구구단을 계산해서 gugu.txt에 출력
with open('gugu.txt','w') as file:
    for i in range(2,10): # 단 , 2~9
        for n in range(1,10): # 곱할 수, 1~9
            result = i*n
            file.write(f'{i} X {n} = {result}\n')

#gugu.txt파일 읽어오기
with open('gugu.txt','r') as file:
    contents = file.read()
    print(contents)

#숫자 2의 갯수는?
find2 = contents.count('2')
print(f'숫자 2의 갯수 : {find2}개')



#딕셔너리
#{
#    키1 : 값1
#    키2 : 값1
#    키3 : 값1
#}
#으로 구성
#딕셔너리는 인덱스가 없다
#대신 키가 인덱스 역할을 한다.
#왜? 키는 절대 중복이 되지 않기 때문이다.
#값을 읽어올때는 dic[키1] 이런식으로 읽어온다.

#딕셔너리와 json은 형식이 동일하다. 사용법도 거의 일치한다.

#json파일을 만들어보자. => json파일은 웹페이지에서 자료를 주고 받을 때 사용하는 자료구조이다.

#json파일을 만드려면 json 모듈을 import 해야한다.
import json

dict_list = {
    {
    'name' : 'james',
    'age' : 20,
    'spec' : [175.5,70.5]
    },
    {
        'name': 'alice',
        'age': 21,
        'spec': [168.5, 60.5]
    }

}

#dumps는 병렬인 데이터를 직렬로 변경해주는 역할
json_string = json.dumps(dict_list)

with open('dictList.json','w') as file:
    file.write(json_string)

print('dictList.json 파일이 생성되었습니다.')
"""