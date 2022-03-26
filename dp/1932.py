n = int(input())

tri = []
for _ in range(n):
    tri.append(list(map(int, input().split())))

dp = []
for i in range(n):
    dp.append([0 for _ in range(len(tri[i]))])

dp[0][0] = tri[0][0]

for i in range(1, n):
    for j in range(len(tri[i])):
        if j == 0: # 왼쪽 대각선은 위의 값을 그대로 가져와 더함
            dp[i][0] = tri[i][0] + dp[i-1][0]
        elif j == i : # 오른쪽 대각선도 마찬가지
            dp[i][j] = tri[i][j] + dp[i-1][j-1]
        else: # 왼쪽 대각선위의 값과 오른쪽 대각선의 위의값중 큰 값을 더해서 누적
            dp[i][j] = tri[i][j] + max(dp[i-1][j-1], dp[i-1][j])

print(max(dp[n-1]))
            
