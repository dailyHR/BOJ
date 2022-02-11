# -*- coding: utf-8 -*-
"""
Created on Fri Feb 11 12:53:05 2022

@author: user-pc
"""

n = int(input())

dp = [0] * 1001

dp[1] = 1
dp[2] = 2

for i in range(3, 1001):
    dp[i] = dp[i-1] + dp[i-2]
    
print(dp[n]% 10007)