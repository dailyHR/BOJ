n = int(input())
a = list(map(int, input().split()))
dp = [[0, 0] for _ in range(n)]

dp[0][0] = a[0]
for i in range(1, n):
    # dp[i] = max(dp[i-1]+a[i], a[i])
    if dp[i-1][0]+a[i] > a[i]:
        dp[i][0] = dp[i-1][0] + a[i]
        dp[i][1] = dp[i][0] - a[i]
    else:
        dp[i][0] = a[i]
        dp[i][1] = dp[i-1][1] + a[i]


print(dp)
