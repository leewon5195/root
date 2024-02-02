import sys


class Person:

    def __init__(self, name, phone, addr):
        self.name = name
        self.phone = phone
        self.addr = addr

    def info(self):
        print('{}, {}, {}'.format(self.name, self.phone, self.addr))


class AddressBook:

    def __init__(self):
        self.address_list = []
        self.file_reader()

    def file_reader(self):
        try:
            file = open('addressBook.csv', 'rt')  # addrBook.csv 파일이 없으면 예외 발생
        except:  # 예외 처리 (addressBook.csv 파일이 없을 때)
            print('addressBook.csv 파일이 없습니다.')
        else:  # 정상 처리 (addressBook.csv 파일이 있을 때)
            while True:
                buffer = file.readline()
                if not buffer:
                    break
                name = buffer.split(',')[0]
                phone = buffer.split(',')[1]
                addr = buffer.split(',')[2].rstrip('\n')
                self.address_list.append(Person(name, phone, addr))
            print('addressBook.csv 파일을 로드했습니다.')
            file.close()

    def file_generator(self):
        try:
            file = open('addressBook.csv', 'wt')
        except:
            print('addressBook.csv 파일을 생성할 수 없습니다.')
        else:
            for person in self.address_list:
                file.write('{},{},{}\n'.format(person.name, person.phone, person.addr))
            file.close()

    def menu():  # self 매개변수가 없는 정적 메소드
        print('-' * 30)
        print('신규 주소록 등록은 1번')
        print('기존 주소록 삭제는 2번')
        print('기존 주소록 수정은 3번')
        print('주소록 검색은 4번')
        print('전체 주소록 출력은 5번')
        print('프로그램 종료는 0번')
        print('-' * 30)
        choice = int(input('수행할 작업을 숫자로 입력하세요 >>> '))
        return choice

    def exit(self):
        print('프로그램을 종료합니다.')
        sys.exit()

    def run(self):
        while True:
            choice = AddressBook.menu()
            if choice == 0: self.exit()
            elif choice == 1: self.insert()
            elif choice == 2: self.delete()
            elif choice == 3: self.update()
            elif choice == 4: self.search()
            elif choice == 5: self.printAll()
            else: print('없는 명령입니다. 확인 후 다시 입력하세요.')

    def insert(self):
        print('=== 신규 주소록 생성 ===')
        #이름, 연락처, 주소를 입력받아 Person이라는 객체로 만들어서 list에 append한다.
        name = input('등록할 이름 입력>>>')
        phone = input('등록할 전화번호 입력>>>')
        addr = input('등록할 주소 입력>>>')

        if name and phone and addr: #이름과 연락처와 주소를 모두 입력받았다면...
            self.address_list.append(Person(name,phone,addr))
            #csv 파일에 저장해야 한다.
            self.file_generator()

            print('신규 주소록이 정상적으로 생성되었습니다.')

        else: #이름,연락처,주소중 어느 하나라도 입력받지 못했다면..
            print('입력값이 부족하여 주소록이 생성되지 않았습니다.')



    def delete(self):
        print('=== 기존 주소록 삭제 ===')
        name = input('삭제할 이름 입력>>>')
        if not name: #이름이 없다면... 그냥 엔터를 칠수도 있으므로...
            print('입력된 이름이 없어 삭제를 취소합니다.')
            return

        #나중 대비 변수를 하나 선언
        deleted = False

        #삭제를 하려면 리스트에서 삭제할 이름을 찾아야 한다. 따라서 반복문을 통해 찾아본다.
        #enumerate : 인덱스번호와 값을 순서대로 가져오는 메서드.
        #i : 인덱스 번호 가져오는 변수
        #person : Person 객체를 가져오는 변수
        for i, person in enumerate(self.address_list):
            #사용자로부터 받은 이름과 리스트안에 있는 이름이 같다면...
            if name == self.address_list[i].name:
                print(f'검색된 전화번호가 {self.address_list[i].phone}입니다.')
                # 사용자로부터 입력받은 y,n를 대문자로 변환하여 'y'가 아니라면...
                if input('삭제할까요?(Y/N)>>>').upper() != 'Y':
                    continue #다음 사람을 검색해라~ 다음 반복으로 넘기라는 뜻...
                #'y'를 눌렀따면...
                self.address_list.pop(i) #실제로 삭제하는 코드
                deleted = True
                print(f'{name}의 정보를 삭제했습니다.')

                #삭제가 됐으므로 변경된 주소록 내용을 csv파일로 보낸다.
                self.file_generator()
                break
            #deleted = True 또는 deleted = False 를 쓴 이유는
            #해당 데이터를 삭제했는지 안했는지를 확인하기 위해 사용하는 변수이다.
            #즉, 삭제를 했으면 deleted = True일것이고 안했스면 deleted = False일 것이다.
            #이것으로 삭제 유무를 판단하기 위함이다.
            if not deleted: # deleted = False
                print(f'{name}의 정보가 삭제되지 않았습니다.')


    def update(self):
        print('=== 기존 주소록 수정')

    def search(self):
        print('=== 주소록 검색 ===')

    def printAll(self):
        print('=== 전체 연락처 출력 ===')






my_app = AddressBook()
my_app.run()
'''
import sys

# Person 이라는 클래스를 만든다
# 이유는 주소록에 넣은 데이터의 기준이 사람이 이기 때문에
# 한사람 한사람을 객체로 만들기 위해 Person이라는 클래스를 만든것이다.
class Person:
    # Person객체는 이름, 연락처, 주소를 가지고 생성되게 하기 위하여 생성자 메서드를 이용하였다.
    def __init__(self, name, phone, addr):
        self.name = name
        self.phone = phone
        self.addr = addr

    # Person 객체가 태어나서 해당 정보를 확인하기 위해 정의
    # 출력목적 메서드.
    def info(self):
      print(f'{self.name},{self.phone},{self.addr}')

class AddressBook:
    # 주소록을 리스트 형태로 생성할 예정임.
    # csv파일을 읽어오는 역할 하는 기능을 추가하였다.
    def __init__(self):
        self.address_list = []
        self.file_reader()


    # csv 파일을 읽어오라고 호출을 하면 실제로 읽어올수 있도록 코드 작성
    def file_reader(self):
        # 수업중 배운 csv파일 읽어오기 복붙
        # 다만, csv 파일이 존재 하지 않을 수도 있다.
        # 존재하지 않으면 예외가 발생하므로 미리 대비해 놓기 위해 try ~ except를 사용하자
        try:
            # addressBook.csv를 읽어오기를 담당하는 전문 객체 => file
            file = open('addressBook.csv', 'rt')
        except: #예외처리
            print('addressBook.csv 파일이 없습니다.')
        else : # addressBook.csv 파일이 있다면~
            while True: # 다 읽어들일때까지 무한반복
                # csv파일을 한줄씩 읽어들여 buffer안에 넣는다.
                buffer = file.readline()

                if not buffer: # buffer 변수에 아무값도 없다면~(다 읽어왔다는 뜻)
                    break

                # buffer.split(',') 의 결과는 리스트로 리턴된다.
                name = buffer.split(',')[0]
                phone = buffer.split(',')[1]
                #csv의 맨 마지막 데이터는 엔터를 가지고 있다. 이것을 없애야 정상적으로 읽을 수 있다.
                addr = buffer.split(',')[2].rstrip('\n')

                # ★★★★ 빈 리스트에 Person 이라는 객체가 생성되어 추가되었다.
                # 주소록에 등록이 되었다 라는 뜻
                # 이런식으로 무한반복
                self.address_list.append(Person(name, phone, addr))

            print('addressBook.csv 파일을 로드했습니다.')
            file.close()

        # csv에 쓰기를 위한 메서드를 만들어보자.
        # 파일 입출력과 관련해서는 항상 예외를 대비해야 한다.
    def file_generator(self):
        try :
            # addressBook.csv 파일에 쓰기담당 객체 file을 만들었다.
            file = open('addressBook.csv','wt')
        except: # 예외가 발생됐다면~
            print('addresBook.csv 파일을 생성할 수 없습니다.')
        else : # 예외가 발생되지 않았다면~
            # person 이라는 변수(집게)를 통해 객체를 리스트에서 하나씩 꺼내온다
            for person in self.address_list:
                # csv파일에 저장한다(쓴다).
                file.write(f'{person.name},{person.phone},{person.addr}')
            file.close()

        # 화면에 표시될 메뉴를 만드는 메서드.
        def menu():
            print('-'*30)
            print('신규 주소록 등록은 1번')
            print('기존 주소록 삭제는 2번')
            print('기존 주소록 수정은 3번')
            print('주소록 검색은 4번')
            print('전체 주소록 출력은 5번')
            print('프로그램 종료는 0번')
            print('-' * 30)

            choice = int(input('수행할 작업을 숫자로 입력하세요 >>> '))

            # choice 변수는 menu() 를 호출한 놈한테 다시 던져준다...
            # 프로그래밍에서는 엄청나게 중요한 개념이다.
            return choice

        # 참고... 클래스(설계도) = 기능(함수, 메서드) + 속성(값)

        # 종료(0번)누르면 프로그램을 종료하게 하는 메서드.
        def exit(self):
            print('프로그램을 종료합니다.')
            # 실제로 프로그램을 종료시키는 방법
            # sys 모듈을 import해야한다.
            sys.exit()

        # 주소록 프로그램을 실제로 실행시키는 메서드를 만들어보자
        def run(self):
            while True: # 무한반복(메뉴는 항상 화면에 띄워져있어야 하므로)
                # AddressBook 클래스의 menu() 메서드를 호출하여 결과값을 choice에 넣는다.
                choice = AddressBook.menu()

                # 사용자가 선택한 번호에 따라 작업할 메서드를 호출
                if choice == 0:
                    self.exit()
                elif choice == 1:
                    self.insert()
                elif choice == 2:
                    self.delete()
                elif choice == 3:
                    self.update()
                elif choice == 4:
                    self.search()
                elif choice == 5:
                    self.printAll()
                else:
                    print('없는 명령입니다. 확인 후 다시 입력하세요.')

# AddressBook() 이라는 클래스(설계도)를 통해 my_app라는 객체를 만들겠다.
# my_app : 주소록 이라는 객체
# AddressBook() : 클래스(설계도)
# 객체 = 클래스()

'''


