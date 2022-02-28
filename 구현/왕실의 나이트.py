s = input()

column = ord(s[0]) - ord('a') + 1
# 아스키코드 변환 함수 : ord()
row = int(s[1])

dx = [-2,-2, 2, 2, -1,-1, 1, 1]
dy = [1, -1, 1, -1, 2,-2, 2,-2]

count = 0
for i in range(8):
    x = column + dx[i]
    y = row + dy[i]
    
    if (x >= 1 and x <= 8) and(y >= 1 and y <=8):
        count += 1

print(count)
