import sys
N = int(input())

data = {}
for _ in range(N):
    book_name = sys.stdin.readline().rstrip()
    if book_name in data :
        data[book_name] += 1
    else:
        data[book_name] = 1

max_val = max(data.values())

li = []
for name, value in data.items():
    if value == max_val :
        li.append(name)

print(sorted(li)[0])