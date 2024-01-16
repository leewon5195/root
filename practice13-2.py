file = open('연락처.txt','rt') #기본파일 열기
f_data = file.read()    #011찾기
n = f_data.count('"011-')
print(f'총 {n}건의 011 데이터를 찾았습니다.')

f_data = f_data.replace('"011-','"010-')    #010 수정
file.close()

new_file = open('연락처.txt','wt')     #원본파일에 덮어쓰기
new_file.write(f_data)      #수정된 내용을 파일에 덮어쓴다
new_file.close()
print('모든 데이터를 수정했습니다.')