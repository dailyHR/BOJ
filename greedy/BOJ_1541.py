s = input()

li = s.split('-')

for i in range(len(li)):
    
    temp = li[i].split('+')
    for j in range(len(temp)):
        temp[j] = int(temp[j].lstrip('0'))
    
    li[i] = sum(temp)
    

result = li[0]
for i in range(1, len(li)):
    result -= li[i]
print(result)
    
