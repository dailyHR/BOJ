n = input()

li = [0] * 10

for i in range(len(n)):
    num = int(n[i])
    if num == 6 or num == 9:
        if li[6] < li[9]:
            li[6] += 1
        else:
            li[9] += 1
    else:
        li[num] += 1

print(max(li))
