file = open('hello.txt','rt')

while True:
    str = file.readline() #한줄씩 읽어들인다.
    if str == '': #더이상 읽어들일 자료다 없다면~
        break
    print(str,end='')

file.close()