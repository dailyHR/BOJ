import sys
N, M = map(int, input().split())
data = list(map(int, sys.stdin.readline().split()))

end = 0
count = 0
interval_sum = 0

for start in range(N):
    while interval_sum < M and end < N:
        interval_sum += data[end]
        end += 1
    if interval_sum == M:
        count += 1
    interval_sum -= data[start]
print(count)
