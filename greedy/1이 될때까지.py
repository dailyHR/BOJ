# -*- coding: utf-8 -*-
"""
Created on Mon Feb 14 17:56:26 2022

@author: user-pc
"""

N, K = map(int, input().split())

count = 0
while N != 1:
    if N % K != 0:
        N -= 1
        count += 1
    else :
        N //= K
        count += 1
    
print(count)
