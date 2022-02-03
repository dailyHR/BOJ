# -*- coding: utf-8 -*-
"""
Created on Thu Feb  3 17:00:03 2022

@author: user-pc
"""

N, B = input().split(" ")
B = int(B)
table = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

result = 0

for i in range(0, len(N)):
    change_value = int(table.find(N[len(N)-i-1]))
    # 문자열에서 index 찾고 싶을 때 문자열.find() 사용
    temp = B**i
    temp = temp * change_value
    result += temp
print(result)