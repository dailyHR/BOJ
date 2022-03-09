value = input()

# 각 인덱스에 맞게 문자 저장
dial = ['', '', 'ABC' ,'DEF', 'GHI', 'JKL', 'MNO'
        , 'PQRS', 'TUV', 'WXYZ']

num = 0
for i in range(len(value)):
    for j in range(len(dial)):
        if value[i] in dial[j] :
            # 1번은 2초가 걸리므로 +1을 해줌
            num += j + 1
            break
print(num)
