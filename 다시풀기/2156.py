import sys
n = int(input())

grapes = []
for _ in range(n):
    grapes.append(int(sys.stdin.readline()))

dp = [0] * n
if n == 1 :
    print(grapes[0])
elif n == 2:
    print(sum(grapes))
else:
    dp[0] = grapes[0]
    dp[1] = grapes[1] + grapes[0]
    dp[2] = max(grapes[2] + grapes[1], grapes[0]+grapes[2], dp[1])

    for i in range(3, n):
        dp[i] = max(dp[i-1], grapes[i]+grapes[i-1]+dp[i-3], grapes[i]+grapes[i-2])
    print(dp[n-1])
