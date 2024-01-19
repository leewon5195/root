"""
#json 파일 읽어오기
import json

with open('dictList.json','r') as file:

    #file 객체가 dictList.json 파일을 통째로 읽어와서 json_reader 변수에 넣는다.
    json_reader = file.read()

    #json 객체는 loads()메서드를 이용하여 변수에 저장된 내용을 로딩해서 dict_list에 넣는다.
    #메서드의 리턴타입은 대부분 리스트 형식
    dict_list = json.loads(json_reader)

for dict in dict_list:
    print('이름:{}'.format(dict['name']))
    print('나이:{}'.format(dict['age']))
    print('키:{}'.format(dict['spec'][0]))
    print('몸무게:{}'.format(dict['spec'][1]))
    print()

# --- 예제 1 ---

#확장자가 txt인것만 받기 위해 무한 루프
while True:
    filename = input('복사할 파일명을 입력하세요 >>> ')
    extname = filename[filename.rfind('.')+1:]
    if extname != 'txt':
        print('복사할 수 없는 파일입니다.')
    else: #확장자가 txt이면~~~~
        break
with open(filename,'rt') as source:
    #복사를 위해 복사파일의 물길을 또 만들어 줘야 한다
    with open('복사본-'+filename,'wt') as copy:
        while True:
            #원본에서 하나씩 읽어와서 buffer 객체에 넣는다
            buffer = source.read(1)
            if not buffer: #버퍼가 비어있다면.. 더이상 가져올 원본이 없다면..
                break
            copy.write(buffer)
print('복사본-'+filename+'파일이 생성되었습니다.')

#파이썬은 분석 및 예측 등의 계산을 위한 언어
#본 예제가 중요!!!

#csv파일을 읽어오려면 import 해야 한다.

import csv

with open('cctv.csv','r') as csvFile:
    #csv 모듈안에 reader 메서드를 이용하여 읽어오겠다.
    buffer = csv.reader(csvFile,dilimiter=',',quotechar='"')
    totalcctv = 0
    #buffer 안에 있는 목록들을 인덱스와 값을 가져온다.
    for i,line in enumerate(buffer):
        if i != 0:
            totalcctv = totalcctv + line[4]
    print('서울특별시 마포구에 설치된 cctv는 총 {}대입니다.'.format(totalcctv))



#클래스는 설계도 역할이다.
#객체란 : 현실세계에 있는 모든 것을 프로그램화 시킨 것.
#클래스(설계도)가 있어야 객체(건물)를 만들수 있다.
def student_info(name,department,professor,phone,address,grade):
    print(name)
    print(department)
    print(professor)
    print(phone)
    print(address)
    print(grade)

name1 = 'emily'
department1 = 'computer engineering'
professor1 = 'james'
phone1 = '010-1234-5678'
address1 = 'seoul'
grade1 = 'A'

name2 = 'jhon'
department2 = 'computer engineering'
professor2 = 'james'
phone2 = '010-1234-5678'
address2 = 'seoul'
grade2 = 'A'


student1 = Student('emily','computer','james','010-1234-5678','seoul','A')



#클래스 선언
class Person:
    #클래스는 값과 속성으로 이루어진다.
    #값은 변수이고, 속성은 함수이다.
    #변수와 함수를 이용해 설계도를 만든거 => 클래스

    #self : 나 자신이라는 뜼으로 클래스에서는 의무적으로 써서 다른 값과 구별을 하는 목적
    def who_am_i(self,name,age,tel,address):
        self.name = name
        self.age = age
        self.tel = tel
        self.address = address


#boy 라는 객체를 생성 => boy라는 객체를 만들기 위해 틀만 만들어 놓은 거다.
#객체 = 클래스()
#boy라는 객체를 만들기위해 Person()이라는 틀을 이용한다.
boy = Person()
boy.who_am_i('john',15,'123-1234','toronto')
print(boy.name)
print(boy.age)

"""
class Computer:
    #기능을 담당하는 함수
    def set_spec(self,cpu,ram,vga,ssd):
        #나의 변수 넘겨받은 값(구별을 하기 위해 self 라는 들어간거다)
        self.cpu = cpu
        self.ram = ram
        self.vga = vga
        self.ssd = ssd

    #출력담당 함수
    def hardware_info(self):
        print('CPU = {}'.format(self.cpu))
        print('RAM = {}'.format(self.ram))
        print('VGA = {}'.format(self.vga))
        print('SSD = {}'.format(self.ssd))

    desktop = Computer()
    desktop.set_spec()

