file = open('hello.txt','rt')

line_list = file.readlines()  #readlines -> 줄 단위로 읽어오기

for line in line_list:
    print(line,end='')

file.close()