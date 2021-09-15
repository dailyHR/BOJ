#백준 알고리즘 2953 : 나는 요리사다

maxNum = 0
index = 0

for i in range(0,5) :
    inputNumber = map(int, input().split())
    inputSum = sum(inputNumber)
    
    if maxNum < inputSum :
        maxNum = inputSum
        index = i + 1

print(index, maxNum)