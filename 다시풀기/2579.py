n = int(input())

stairs = []
dp = [0] * (n)
for _ in range(n):
    stairs.append(int(input()))

# 1. 마지막 계단 전의 계단을 밟은 경우
# 2. 마지막 계단 전의 계단을 밟지 않은 경우
if n == 1 :
    print(stairs[0])
elif n == 2:
    dp[0] = stairs[0]
    dp[1] = max(stairs[0]+stairs[1], stairs[1])
    print(dp[1])
else:
    dp[0] = stairs[0]
    dp[1] = max(stairs[0]+stairs[1], stairs[1])
    dp[2] = max(stairs[0]+stairs[2], stairs[1]+stairs[2])

    for i in range(3, n):
        dp[i] = max(stairs[i-1]+dp[i-3], dp[i-2]) + stairs[i]
    print(dp[n-1])
