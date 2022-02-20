# -*- coding: utf-8 -*-
"""
Created on Sun Feb 20 15:43:13 2022

@author: user-pc
"""

t = int(input())

for i in range(t):
    n = int(input())
    li = list(map(int, input().split()))
    
    result = []
    
    while len(result) != n :
        temp = li.pop(0)
        if temp//0.75 in li :
            result.append(temp)
            li.remove(temp//0.75)
    

    print(f"Case #{i+1}: ", end="")
    for k in result :
        print(k,end=" ")
            
