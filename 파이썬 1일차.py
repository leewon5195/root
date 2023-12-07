Python 3.11.1 (tags/v3.11.1:a7a450f, Dec  6 2022, 19:58:39) [MSC v.1934 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.

==================== RESTART: C:/Users/User/Desktop/day01.py ===================

==================== RESTART: C:/Users/User/Desktop/day01.py ===================
a= 123
a = -178
a = 1.2
b = -3.45
b
-3.45
a
1.2
a
1.2
b
-3.45
a = 4.24E10
a
42400000000.0
a = 0o177
a
127
a = 0x8ff
a
2303
b = 0xABC
b
2748
a= 3
b= 4
a+4
7
7%3
1
7/4
1.75
3+2
5
"안녕하세요"
'안녕하세요'
"""안녕하세요 SBS입니다."""
'안녕하세요 SBS입니다.'
"""
안녕하세요
SBS입니다.
"""
'\n안녕하세요\nSBS입니다.\n'
"""안녕하세요
아녀
아녀녀녀ㅕ
"""
'안녕하세요\n아녀\n아녀녀녀ㅕ\n'
food  = "python favorite food is per"
food
'python favorite food is per'
food
'python favorite food is per'
say = '"phython is very easy."he says'
say
'"phython is very easy."he says'
say = "\"python is very easy.\"he says"
say
'"python is very easy."he says'
"""
가나다
ABC
"""
'\n가나다\nABC\n'
multiline = "Life is too short\n You need python"
multiline
'Life is too short\n You need python'
head = "python"
tail = "is fun"
head + tail
'pythonis fun'
a = "python"
a * 2
'pythonpython'
a * 4
'pythonpythonpythonpython'
a
'python'
a = a*2
a
'pythonpython'
len(a)
12
a = a*4
a
'pythonpythonpythonpythonpythonpythonpythonpython'
len(A)
Traceback (most recent call last):
  File "<pyshell#58>", line 1, in <module>
    len(A)
NameError: name 'A' is not defined. Did you mean: 'a'?
a = "Life is too short, You need Python"
a
'Life is too short, You need Python'
a[3]
'e'
a[1]
'i'
a[-1]
'n'
a[-4]
't'
a
'Life is too short, You need Python'
a[0]+a[1]+a[2]+a[3]
'Life'
a[0:4]
'Life'
a[0:3]
'Lif'
a[:]
'Life is too short, You need Python'
a[0:5]
'Life '
a[:4]
'Life'

a[0:4]
'Life'
a[19]
'Y'
a[19:]
'You need Python'
a = "202312071Rany"
a
'202312071Rany'
date = a[:8]
date
'20231207'
date
'20231207'
weather = a[8:]
weather
'1Rany'
weather = a[9:]
weather
'Rany'
date
'20231207'
year = date[:3]
year
'202'
year = date[:4]
yaer
Traceback (most recent call last):
  File "<pyshell#89>", line 1, in <module>
    yaer
NameError: name 'yaer' is not defined
year = date[:4]
year
'2023'
pin = "881120 - 1068234"
pin
'881120 - 1068234'
yyyymmdd = pin[7:]
yyyymmdd
'- 1068234'
yyyymmdd = pin[8:]
yyyymmdd
' 1068234'
num = "yyyymmdd"
num
'yyyymmdd'
yyyymmdd = pin[:5]
yyyymmdd
'88112'
yyyymmdd = pin[:6]
yyyymmdd
'881120'
num = [8:]
SyntaxError: invalid syntax
num = pin[8:]
num
' 1068234'
weather = 20
weather
20
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 20 도 입니다.'
weather = -5
"현재 온도는 %s 도 입니다."%weather
'현재 온도는 -5 도 입니다.'
"I eat %d apples"%3
'I eat 3 apples'
"I eat %d apples"%10
'I eat 10 apples'
"I eat %s apples"%"five"
'I eat five apples'
num = 100
"I eate %d apples"%num
'I eate 100 apples'
num = 1000
"I eat %d apples"%num
'I eat 1000 apples'
number = 10
day = "three"
number
10
day
'three'
" I eat %number apples. so I was sick for %s day."%(number,day)
Traceback (most recent call last):
  File "<pyshell#123>", line 1, in <module>
    " I eat %number apples. so I was sick for %s day."%(number,day)
ValueError: unsupported format character 'n' (0x6e) at index 8
"I eat %d apples. so I was sick for %s days."%(number,day)
'I eat 10 apples. so I was sick for three days.'
"%s"%"hi"
'hi'
"%2s"%"hi"
'hi'
"%4s"%"jo
SyntaxError: incomplete input
"%4s"%"hi"
'  hi'
"%10s"%"hi"
'        hi'
"%-10sjane."%"hi"
'hi        jane.'
3.42134234
3.42134234
"%f"%3.32134234
'3.321342'
"%0.4f 입니다."%3.421341245
'3.4213 입니다.'
"%10.4f"%3.421231245
'    3.4212'
"I eat %d apples"%5
'I eat 5 apples'
"I eat {0} apples."format(3)
SyntaxError: invalid syntax
"I eat {0} apples".format(3)
'I eat 3 apples'
number = 3
"I eat{0} apples".format(number)
'I eat3 apples'
number
3
day = "three"
"I eat{0} apples.so I was sick for{1} days.".format(number,day)
'I eat3 apples.so I was sick forthree days.'
"I eat {0} apples. so I was sick for {1}.".format(number = 10,day=5)
Traceback (most recent call last):
  File "<pyshell#143>", line 1, in <module>
    "I eat {0} apples. so I was sick for {1}.".format(number = 10,day=5)
IndexError: Replacement index 0 out of range for positional args tuple
"I ate {number} apples. so I was sick for {day} days.".format(number=10,day=3)
'I ate 10 apples. so I was sick for 3 days.'
"I ate {0} apples. so I was sick for {day} days.".format(10,day=20)
'I ate 10 apples. so I was sick for 20 days.'
name = "홍길동"
age = 30
f'나의 이름은{name} 입니다. 나이는 {age} 입니다.'
'나의 이름은홍길동 입니다. 나이는 30 입니다.'
d = {'name':'홍길동'.'age':30}
SyntaxError: invalid syntax
d = {'name':'홍길동','age':30}
f '나의 이름은{d["name"]}입니다.나이는{d}
SyntaxError: incomplete input
f
Traceback (most recent call last):
  File "<pyshell#152>", line 1, in <module>
    f
NameError: name 'f' is not defined
s
f'나의 이름은{d["name"]}입니다.나이는{d}'
"나의 이름은홍길동입니다.나이는{'name': '홍길동', 'age': 30}"
a = "hobby"
a
'hobby'
a.count('b')
2
a = "python is the best choice"
a
'python is the best choice'
a.find('b')
14
a[14]
'b'
a.find(c)
Traceback (most recent call last):
  File "<pyshell#161>", line 1, in <module>
    a.find(c)
NameError: name 'c' is not defined
a.find('c')
19
a[19]
'c'
".".join('abcd')
'a.b.c.d'
a= "hi"
a.upper()
'HI'
b = "HI"
b,lower()
Traceback (most recent call last):
  File "<pyshell#168>", line 1, in <module>
    b,lower()
NameError: name 'lower' is not defined
b.lower()
'hi'
a = "Life is too short"
a.replace("Life"."Your leg")
SyntaxError: invalid syntax
a.replace("Life","Your leg")
'Your leg is too short'
a.split()
['Life', 'is', 'too', 'short']
a[0]
'L'
b = "a:b:c:d"
b.split(':')
['a', 'b', 'c', 'd']
a = [1,2,3]
a
[1, 2, 3]
a[0]
1
a[1]
2
>>> a[3]
Traceback (most recent call last):
  File "<pyshell#181>", line 1, in <module>
    a[3]
IndexError: list index out of range
>>> a[2]
3
>>> a[0]+a[2]
4
>>> a[-1]
3
>>> a = [1,2,3,['a','b','c']]
>>> a
[1, 2, 3, ['a', 'b', 'c']]
>>> a[3]
['a', 'b', 'c']
>>> a[1]
2
>>> a[3]
['a', 'b', 'c']
>>> a[4]
Traceback (most recent call last):
  File "<pyshell#190>", line 1, in <module>
    a[4]
IndexError: list index out of range
>>> a[3]
['a', 'b', 'c']
>>> a[0]
1
>>> a[-1]
['a', 'b', 'c']
>>> a[-1][0]
'a'
>>> a[-1][2]
'c'
>>> 
>>> 
>>> 
>>> 
