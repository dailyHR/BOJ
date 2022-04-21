N, M = map(int, input().split())

data = list(map(int, input().split()))
sum_value = 0

prefix_sum = []

for i in data:
    sum_value += i
    prefix_sum.append(sum_value)

for _ in range(M):
    i, j = map(int, input().split())
    if i == j :
        print(data[j-1])
    elif i == 1:
        print(prefix_sum[j-1])
    else:
        print(prefix_sum[j-1] - prefix_sum[i-2])
