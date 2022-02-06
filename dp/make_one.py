# -*- coding: utf-8 -*-
"""
Created on Sun Feb  6 13:34:35 2022

@author: user-pc
"""

X = int(input())

dp = [0] * 100

dp[1] = 1
dp[2] = 1
dp[3] = 1
dp[5] = 1

# 내 풀이
for i in range(2, X+1):

    if i % 5 == 0 and i != 5:
        dp[i] = dp[i//5] + 1
    if i % 3 == 0 and i != 3:
        k = dp[i//3] + 1
        if dp[i] != 0 :
            dp[i] = min(k, dp[i])
        else :
            dp[i] = k
    if i % 2 == 0 and i != 2:
        k = dp[i//2] + 1
        if dp[i] != 0:
            dp[i] = min(k, dp[i])
        else:
            dp[i] = k

    if dp[i-1] < dp[i] or dp[i] == 0:
        dp[i] = dp[i-1] +1
        

print(dp[X])

# 정답
d = [0] * 100

for i in range(2, X+1):
    d[i] = d[i-1] + 1
    if i % 2 == 0:
        d[i] = min(d[i], d[i//2] + 1)
    if i % 3 == 0:
        d[i] = min(d[i], d[i//3] +1)
    if i % 5 == 0:
        d[i] = min(d[i], d[i//5] +1)

print(d[X])