# -*- coding: utf-8 -*-
"""
Created on Thu Feb  3 17:30:29 2022

@author: user-pc
"""
A, B = map(int,input().split())
m = int(input())
number = list(map(int, input().split()))

deci = 0
k=m
for i in range(m) :
    k-=1
    deci += A**i*number[k]
    
result = ''
while deci != 0 :
    result = ' ' +result
    result = str(deci%B)+result
    deci //= B
print(result)