n = int(input())
li = list()
for i in range(n):
    li.append(int(input()))

li.reverse()

count = 0
for i in range(1, len(li)):
    num = li[i]
    
    while num >= li[i-1]:
        num -= 1
        count += 1
        
    li[i] = num
    
print(count)
