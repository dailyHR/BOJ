n = int(input())
li = list(map(int, input().split()))
li = sorted(li, reverse=True)

count = 0
i = 0
while i < len(li):
    num = li[i]
    while num > 0:
        i += 1
        num -= 1
    count += 1

print(count)
