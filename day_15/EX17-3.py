try:
    score = int(input('점수를 입력하세요>>>'))
    if score < 0 or score > 100:
        raise Exception('점수는 0~100사이입니다.')
except Exception as e: # e라는 객체에 예외메세지를 담는다.
    print(e)
else:
    if score >= 80:
        print(f'{score}점은 합격입니다.')
    else:
        print(f'{score}점은 불합격입니다.')
