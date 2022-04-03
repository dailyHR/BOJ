
n = int(input())

data = []

for _ in range(n):
    x, y = map(int, input().split())
    data.append((x,y))

people = [1] * n

for i in range(n-1):
    for j in range(i+1,n):
        if data[i][0] > data[j][0] and data[i][1] > data[j][1]:
            people[j] += 1
        elif data[i][0] < data[j][0] and data[i][1] < data[j][1]:
            people[i] += 1

for i in people:
    print(i, end=' ')
