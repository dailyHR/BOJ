from bisect import bisect_left, bisect_right
def find_in_array(array, x):
    right = bisect_right(array, x)
    left = bisect_left(array,x)
    return right - left 

N, x = map(int, input().split())
array = list(map(int,input().split()))
if find_in_array(array,x) == 0 :
    print(-1)
else:
    print(find_in_array(array, x))
