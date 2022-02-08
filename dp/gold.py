# -*- coding: utf-8 -*-
"""
Created on Mon Feb  7 16:42:45 2022

@author: fud37
"""

# 내 풀이
T = int(input())
for l in range(T):
    n, m = map(int,input().split(" "))
    gold = list(map(int, input().split(" ")))
    li = [[0]*m for _ in range(n)]
    dp = [[0]*m for _ in range(n)]
    
    k = 0
    for i in range(0,n):
        for j in range(0,m):
            li[i][j] = gold[k]
            k += 1
    for i in range(n):
        dp[i][0] = li[i][0]
        
    for i in range(1, m):
        temp = 0
        for j in range(0,n):
            if j == 0:
                temp = max(dp[0][i-1], dp[1][i-1])
            elif j == n-1 :
                temp = max(dp[n-1][i-1], dp[n-2][i-1])
            else :
                left = dp[j-1][i-1]
                center = dp[j][i-1]
                right = dp[j+1][i-1]
                temp = max(left, center)
                temp = max(temp, right)
                
            dp[j][i] = li[j][i] + temp
        
                
    maxNum = 0
    for i in range(n):
        if maxNum < dp[i][m-1]:
            maxNum = dp[i][m-1]
            
    print(maxNum)
    
# 정답 코드
for tc in range(int(input)):
    #금광 정보 입력
    n, m = map(int,input().split())
    array = list(map(int,input().split()))
    dp = []
    index = 0
    for i in range(n):
        dp.append(array[index:index+m])
        index += m
    for j in range(1, m):
        for i in range(n):
            if i == 0: left_up = 0
            else: left_up = dp[i+1][j-1]
            if i == n-1: left_down = 0
            else : left_down = dp[i+1][j-1]
            left = dp[i][j-1]
            dp[i][j] = dp[i][j] + max(left_up, left_down, left)
    result = 0
    for i in range(n):
        result = max(result, dp[i][m-1])
    print(result)