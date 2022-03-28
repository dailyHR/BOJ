import math

li = []
while True:
    n = int(input())
    if n == 0 :
        break
    li.append(n)

temp = sorted(li)
k = temp[len(li) - 1] * 2

array = [True for _ in range(2*k+1)]
array[1] = False
for i in range(2, int(math.sqrt(k)) + 1):
    if array[i] == True:
        j = 2
        while i * j <= k:
            array[i*j] = False
            j += 1

for i in range(len(li)):
    count = 0
    for j in range(li[i]+1, 2*li[i]+1):
        if array[j] == True:
            count += 1
    print(count)
