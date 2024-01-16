file = open('hello.txt','rt')

str = file.read() #통째로 읽어온다.
print(str,end='')

file.close()