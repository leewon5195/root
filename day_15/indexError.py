a = [10,20,30,40,50] #5개의 요소가 있는 리스트를 a 변수에 넣는다.

try:
    a[10]
except Exception as e: # indexError에 대하여 별칭을 e로 둔다.
                        # e 라는 객체에 에러메세지가 들어간다.
    print(e)
'''
except IndexError as e: # indexError에 대하여 별칭을 e로 둔다.
                        # e 라는 객체에 에러메세지가 들어간다.
    print(e)
'''
