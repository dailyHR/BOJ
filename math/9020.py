
import math
T = int(input())

li = []
for _ in range(T):
    li.append(int(input()))

temp = sorted(li)
k = temp[T-1]

array = [True for _ in range(k+1)]
array[1] = False

for i in range(2, int(math.sqrt(k))+1):
    if array[i]:
        j = 2
        while i*j <= k:
            array[i*j] = False
            j += 1
for j in range(T):
    arr = []
    for i in range(2, li[j]):
        if array[i]:
            num = li[j] -i
            if array[num]:
                arr.append((abs(num-i), min(num,i), max(num,i)))
    arr.sort()
    print(arr[0][1], arr[0][2])
