import math
import sys
k = 1000000

array = [True for _ in range(k+1)]
array[1] = False
for i in range(2, int(math.sqrt(k))+1):
    if array[i]:
        j = 2
        while i * j <= k :
            array[i*j] = False
            j += 1


while True:
    n = int(sys.stdin.readline())
    if n == 0 :
        break

    for i in range(k):
        temp = []
        if array[i]:
            num = n - i
            if array[num]:
                print(n,'=',i,'+',num)
                break
