# -*- coding: utf-8 -*-
"""
Created on Sat Feb 12 13:06:32 2022

@author: user-pc
"""

n = int(input())

dp = [0] * 1001

dp[1] =1
dp[2] =3

for i in range(3, n+1):
    dp[i] = dp[i-1] + dp[i-2]*2
    
print(dp[n]%10007)