# -*- coding: utf-8 -*-
"""
Created on Sat Feb  5 13:04:44 2022

@author: user-pc
"""

N = int(input())
K = list(map(int, input().split(" ")))

dp = [0] * 100
dp[0] = K[0]
dp[1] = K[1]

for i in range(2, N):
    dp[i]=max(dp[i-1], dp[i-2] + K[i])


print(dp[N-1])
