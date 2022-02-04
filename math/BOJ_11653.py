# -*- coding: utf-8 -*-
"""
Created on Fri Feb  4 14:08:30 2022

@author: fud37
"""

N = int(input())

if N != 1 : 
    
    for i in range(2, N+1):
        if N % i == 0 :
            while N % i == 0 :
                print(i)
                N //= i



# 체 써서 푼거.. 시간초과로 틀림.
# if N > 7 :
#     a = [0 for i in range(N+1)]

#     a[0] = 1
#     a[1] = 1
#     for i in range(2, int(math.sqrt(N+1))):
#         for j in range(i*2, N+1, i):
#             a[j] = 1
# else : 
#     a = [1,1,0,0,1,0,1,0]
    
# temp = []

# for i in range(0, N+1):
#     if a[i] == 0:
#         temp.append(i)

# if N != 1 :
#     if N not in temp :
#         while N not in temp :
#             i = 0
#             while (N % temp[i]) != 0 :
#                 i += 1
#             print(temp[i])
#             N //= temp[i]
#     print(N)
