n = int(input())
a = list(map(int, input().split()))
dp = a[:]

value = 0
for i in range(n):
    for j in range(i):
        if a[j] < a[i]:
            dp[i] = max(dp[i], a[i] + dp[j])


print(max(dp))
