# 내 풀이 -> 재귀 사용해서 이진 탐색
def binary_search(array, start, end):
    if start > end :
        return None
    mid = (start+end)//2
    temp = array[mid]
    temp2 = []
    for i in range(len(H)):
        num = H[i]-temp
        if num >= 0 :
            temp2.append(num)
        else:
            temp2.append(0)
    sum_value = sum(temp2)
    
    if sum_value == M :
        return mid
    elif sum_value > M :
        return binary_search(array,mid+1,end)
    else:
        return binary_search(array,start,mid-1)


N, M = map(int, input().split())

H = list(map(int,input().split()))
end_point = max(H)
array = []

for i in range(end_point+1):
    array.append(i)

result = binary_search(array, 0, end_point)
print(result)

# 정답 
n, m = list(map(int, input().split(' ')))
array = list(map(int,input().split()))

start = 0
end = max(array)

result = 0
while(start<=end):
    total = 0
    mid = (start+end)//2
    for x in array:
        if x > mid:
            total += x - mid
    if total < m:
        end = mid - 1
    else:
        result = mid
        start = mid + 1

print(result)
