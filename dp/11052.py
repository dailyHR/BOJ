N = int(input())
P = list(map(int, input().split()))

dp = [0] * (N+1)
P.insert(0,0)

dp[1] = P[1]
for i in range(2, N+1):
    for j in range(1, i+1):
        dp[i] = max(dp[i], P[j] + dp[i-j])

print(dp[N])
