# -*- coding: utf-8 -*-
"""
Created on Mon Feb  7 12:54:31 2022

@author: fud37
"""

N, M = map(int, input().split())

money = []
for i in range(N):
    temp = int(input())
    money.append(temp)
    
#dp = [10_001] * (M+1)

dp = [0] * (M+1)


#내 풀이 1 : dp 초기화 값이 0
for k in money :
    if k < M +1 :
        dp[k] = 1 
    for i in range(k+1, M+1):
        if dp[i-k] != 0 :
            if dp[i] != 0 :
                dp[i] = min(dp[i-k]+1, dp[i])
            else :
                dp[i] = dp[i-k] +1
                
# 내 풀이 2 : dp 초기화 값이 10001
for k in money :
    if k < M+1:    
        dp[k] = 1
    for i in range(k+1, M+1):
        if dp[i-k] != 10_001 :
            dp[i] = min(dp[i], dp[i-k] + 1)

if dp[M] == 0:
    print(-1)
else:
    print(dp[M])