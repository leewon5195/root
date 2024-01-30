try:
    a = int(input('제수를 입력하세요>>>'))
    b = int(input('피제수를 입력하세요>>>'))
    print(f'{a}/{b}={a/b} 입니다.')
    result = a / b
    #여기까지는 예외가 발생하지 않았다면 정상처리가 되는 영역
except ZeroDivisionError:
    print('0으로 나눌 수 없습니다.')
except ValueError:
    print('정수만 입력할 수 있습니다.')
    #여기까지는 예외처리 영역
else:
    # 여기는 코딩영역에서 아무 문제가 없다면...
    print(f'{a}/{b}={a/b}입니다.')
finally: # 예외가 발생하든 안하든 무조건 처리가 되야 하는 영역
    print('프로그램을 종료합니다.')

#예외가 발생하면 프로그램은 강제로 종료가 된다.
#이러면 오해의 소지가 있으므로 필요한 처리를 한 후 안정적으로 종료할 수 있게 해줘야 한다.
#이럴때는 finally를 써서 안정적으로 종료하도록 유도하는 것이 좋다.
#즉, fianlly는 예외와는 상관없이 무조건 실행이 되야 하는 코드를 적는 영역이다.