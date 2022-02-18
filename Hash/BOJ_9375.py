# -*- coding: utf-8 -*-
"""
Created on Fri Feb 18 14:51:56 2022

@author: user-pc
"""

t = int(input())

for i in range(t):
    result = 1
    d = dict()
    n = int(input())
    for j in range(n):
        f, s = input().split()
        if s in d :
            d[s] += 1
        else :
            d[s] = 1
    
    for key in d :
        result *= d[key]+1
    print(result -1)