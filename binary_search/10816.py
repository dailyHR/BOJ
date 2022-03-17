from bisect import bisect_left, bisect_right
def search(num):
    right = bisect_right(arr, num)
    left = bisect_left(arr,num)
    return right - left


N = int(input())
arr = list(map(int, input().split()))
arr.sort()

M = int(input())
arr2 = list(map(int, input().split()))

for i in range(M):
    print(search(arr2[i]), end=' ')
