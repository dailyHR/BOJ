n = int(input())
a = list(map(int, input().split()))
dp = [1] * n

value = 0
for i in range(n):
    for j in range(i):
        if a[j] < a[i]:
            if dp[j] + 1 > dp[i]:
                dp[i] = dp[j] + 1


print(value)
