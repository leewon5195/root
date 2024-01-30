class NameError(Exception):
    def __init__(self, message):
        super().__init__(message)


try:
    name = input('이름을 입력하세요>>>')

    #이름은 2~6자 사이로 입력이 되야 한다. 그렇지 않으면 예외를 발생시켜보자
    if len(name) < 2 or len(name) > 6:
        raise NameError('이름은 2~6자 사이로 입력해 주세요.')
#예외가 발생했다면..
except NameError as e:
    print(e)

#예외가 발생하지 않는다면..
else:
    print(f'입력된 이름은 {name}입니다.')