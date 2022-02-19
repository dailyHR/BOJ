# -*- coding: utf-8 -*-
"""
Created on Sat Feb 19 21:07:37 2022

@author: user-pc
"""

S = input()

K = input()
temp = '';
for i in range(len(S)):
    if not ('0' <= S[i] and '9'>= S[i]) :
        temp += S[i]

if K in temp :
    print(1)
else :
    print(0)
