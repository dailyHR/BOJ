aList = []
oddList = []

for i in range(0,7):
    aList.append(int(input()))

i = 0
while i < len(aList) :
    if aList[i] % 2 == 1:
        oddList.append(aList[i])
    i = i + 1

if len(oddList) == 0 :
    print(-1)
else :
    print(sum(oddList))
    print(min(oddList))