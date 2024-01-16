file = open('hello.txt','rt')

while True:
    str = file.read(5) #다섯글자씩 읽어온다.
    if not str: #str변수에 값이 없다면~ => 더이상 읽을 내용이 없다면~
        break
    print(str,end='')

file.close()