class Quiz:

    answer = ['경기도','강원도','충청남도','충청북도','전라남도','전라북도','경상남도','경상북도','제주특별자치도']

    # 객체없이 모든 작업을 처리할 수 있도록 classmethod를 생성한다.
    @classmethod
    def challenge(cls): #해당 클래스의 이름을 가지고 메서드를 정의한다.
        if not cls.answer: # answer리스트에 값이 없다면...
            print('모든 도를 맞혔습니다. 성공입니다.')
            return

        do = input('정답은? >>>')

        if do not in cls.answer: # answer리스트에 지금 입력받은 도가 없다면...
            raise  Exception('틀렸습니다.') #강제로 예외를 발생하고 메세지를 출력한다.

        for i, answer_do in enumerate(cls.answer):
            if do == answer_do:
                print('정답입니다.')
                cls.answer.pop(i) #정답인 도는 pop시켜서 리스트에서 제거한다.
                #한개의 정답이 나왔으므로 다시 입력받기 위해 루프문을 빠져나간다.
                break

         #자기 자신의 challenge()를 다시 호출한다.
         cls.challenge()

try:
    print('우리나라의 9개 모든 도를 맞히는 퀴즈입니다. 하나씩 대답하세요.')

    # 선생님 input으로 받으면 안되요?
    # 됩니다. 다만 한번만 출력되는 내용이므로 print 일단 출력해놓고 생각해봅시다.

    Quiz.challenge()
except Exception as e:
    print(e)
