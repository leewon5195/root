"""

#2. Bag 이라는 설계도를 만든다.
class Bag:

    # class 변수(객체가 없어도 변수로서의 역할을 하는 변수, 즉 공통 내용을 가지고 있을때 사용)
    # 모든 객체에 적용될 수 있도록 만들었다.
    count = 0

    #매개변수가 없는 생성자는 컴파일러가 자동으로 만들어준다.
    def __init__(self):
        # 컴파일러가 자동으로 생성은 해주지만 별도의 추가 내용이 있다면 명시를 해야한다.
        # bag1이 생성과 동시에 갯수를 1 증가시키는 내용이 추가되었다.
        # ★★★★클래스변수 또는 클래스메서드는 클래스이름으로 참조한다.★★★★
        Bag.count = Bag.count + 1 # 가방의 갯수를 누적하는 공식

    # 클래스메서드 : 객체 생성없이 메서드를 사용하고 싶을 때 쓰는 메서드
    # @classmethod 선은을 해야만 한다.
    @classmethod
    def sell(cls): # cls는 클래스 이름이 들어온다.
        cls.count = cls.count -1 # 가방이 팔리면 전체 갯수에서 1씩 감소시키는 코드

    @classmethod
    def remain_bag(cls):
        return cls.count # 최종 count변수의 값을 리턴해준다.


#1. 객체생성
# 가방 한개 한개를 객체로 만들자
# Bag() 클래스(설계도)를 이용하여 bag1 객체를 만든다.
# 객체 = 클래스()

bag1 = Bag() #()-> 생성자
bag2 = Bag()
bag3 = Bag()

print(f'현재 가방: {Bag.count}개')

bag1.sell() # 올바른 방법이 아니다. => 클래스 메서드를 호출하는 것이므로 Bag.sell() 정답
bag2.sell() # 올바른 방법이 아니다. => 클래스 메서드를 호출하는 것이므로 Bag.sell() 정답
print(f'현재 가방: {Bag.count}개')


#결론
# 인스턴스 변수, 인스턴스 메서드는 객체.변수 또는 객체.메서드() 사용
# 클래스 변수, 클래스 메서드는 클래스.변수 또는 클래스.메서드() 정답
# 다만, 클래스 변수, 클래스 메서드는 객체.변수 또는 객체.메서드() 가능은 하지만, 추천하지 않는다.
# 왜냐하면 클래스 변수 또는 클래스 메서드는 객체생성과는 상관이 없기 때문이다.

"""
#2. 클래스 생성
class Person:
    # 객체가 생성이되면 이름을 가지고 태어나게 하려고 한다.
    def __init__(self,name): # potter -> self에 들어간다. , __init__ -> 초기화
        self.name = name
    def eat(self,food):
        print(self.name + '가' + food +'를 먹습니다.')

class Student(Person):

    #★★★★★★★★
    #아무리 상속관계여도 초기화 메서드는 상속이 불가하다!!!!!!
    #★★★★★★★★
    '''
        def eat(self,food):
        print(self.name + '가' + food +'를 먹습니다.')
    '''
    def __init__(self,name,school):
        super().__init__(name) # 부모클래스의 초기화 메서드를 참조하겠습니다.
        self.school = school

    def study(self):
        print(self.name + '가' + self.school +'에서 공부를 합니다.')


#1. 객체생성
# Student 라는 클래스로 potter 객체를 생성합니다.
potter = Student('헤리포터','호그와트') # Student-> 클래스이름 , ('헤리포터','호그와트')-> 생성자 : 객체를 생성할때 넣을 값

# 결론
# 부모클래스인 Person은 name, eat() 이렇게 2개의 멤버를 가지고 작동된다.
# 상속을 받은 자식클래스는 name, eat(), school, study() 이렇게 4개의 멤버를 가지고 작동된다.
# ★★★ student는 부모 클래스보다 더 많은 기능을 쉽게 상속을 통해 작동된다. ★★★
# 참고, 형제클래스끼리는 상속이 불가하다.

