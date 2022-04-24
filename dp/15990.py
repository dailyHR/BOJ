T = int(input())

DP = [[0 for _ in range(4)] for _ in range(100001)]

num = 1000000009
DP[1][1] = 1
DP[2][2] = 1
DP[3][1] = 1
DP[3][2] = 1
DP[3][3] = 1

for i in range(4, 100001):
    DP[i][1] = (DP[i-1][2] + DP[i-1][3]) % num
    DP[i][2] = (DP[i-2][1] + DP[i-2][3]) % num
    DP[i][3] = (DP[i-3][1] + DP[i-3][2]) % num
for _ in range(T):
    n = int(input())
    print(sum(DP[n]) % num)
