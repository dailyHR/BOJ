# -*- coding: utf-8 -*-
"""
Created on Mon Jan 31 17:28:24 2022

@author: user-pc
@baekjoon : 11005
"""
N, B = map(int, input().split())

table = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
result = ''

while N !=0 :
    
    result += table[N%B]
    N = N // B
    
print(result[::-1])
    
