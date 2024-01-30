#파일처리, 네트워크 처리, DB처리를 할때는 항상 예외처리를 할 준비를 하고 있으면 좋다.
try:
    filename = input('열고자 하는 파일명을 입력하세요>>>') # hello.txt
    file = open(filename,'rt')
except FileNotFoundError:
    print(f'{filename}파일이 존재하지 않습니다.')
#예외가 없다면...
else:
    buffer = file.read()
    print(buffer, end='')
    print()
    file.close()
finally:
    print('프로그램을 종료합니다.')

