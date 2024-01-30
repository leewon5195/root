try:
    a = int(input('제수를 입력하세요>>>'))
    b = int(input('피제수를 입력하세요>>>'))
    print(f'{a}/{b}={a/b} 입니다.')
except Exception:
    print('예외가 발생하였습니다.')
except ZeroDivisionError:
    print('0으로 나눌 수 없습니다.')
except ValueError:
    print('정수만 입력할 수 있습니다.')



#예외처리에서 부모 예외는 맨 아래에다가 적는다.
#대체적으로 개발을 할 때는 Exception으로 모두 처리한다.