# -*- coding: utf-8 -*-
"""
Created on Tue Feb  8 17:30:06 2022

@author: fud37
"""

# LIS(가장 긴 증가하는 부분 수열)문제.
# D[i]는 array[i]를 마지막 원소로 가지는 부분 수열의 최대 길이

N = int(input())
soldier = list(map(int,input().split()))
soldier.reverse()

dp = [1] * N

for i in range(N):
    for j in range(0, i):
        if soldier[i] > soldier[j] :
            dp[i] = max(dp[i], dp[j]+1)
            
print(n-max(dp))
