# 다시 푸는 문제
n = int(input())
li = list(map(int, input().split()))

dp = [0] * n

dp[0] = li[0]

# dp[i] 에는 현재까지 더한 값들의 최대값이 들어있음.
# dp[i]를 선택하거나, dp[i-1]+li[i]를 선택해야함. -> 새로 출발할지 계속 이어갈지 정한다.
for i in range(1,n):
    dp[i] = max(dp[i-1] + li[i], li[i])
print(max(dp))
