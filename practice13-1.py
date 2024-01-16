nation = ['그리스','아테네','독일','베를린','러시아','모스크바','미국','워싱턴']
file = open('nation.txt','wt')

for i, contry in enumerate(nation):
    if i % 2 ==0:
        file.write(f'{nation[i]}-{nation[i+1]}\n')
file.close()

print('생성된 nation.txt 파일의 내용은 다음과 같습니다.')
file = open('nation.txt','rt')
line_list = file.readlines()
for line in line_list:
    print(line,end='')
file.close()