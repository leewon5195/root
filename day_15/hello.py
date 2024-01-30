#hello.txt파일에 텍스트를 쓰기 위해 file이라는 객체를 생성
file = open('hello.txt','wt')

file.write('안녕하세요.\n')
file.write('반갑습니다.\n')

file.close()