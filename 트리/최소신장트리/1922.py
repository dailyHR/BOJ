def find_parent(x):
    if parent[x] != x:
        parent[x] = find_parent(parent[x])
    return parent[x]

def union_parent(v1, v2):
    v1 = find_parent(v1)
    v2 = find_parent(v2)
    if v1 < v2 :
        parent[v2] = v1
    else:
        parent[v1] = v2

N = int(input()) # 컴퓨터의 수 (노드 개수)
M = int(input()) # 연결할 수 있는 선의 수 (간선 개수)
parent = [0] * (N+1)

for i in range(1, N+1):
    parent[i] = i

edge = []
for _ in range(M):
    a, b, c = map(int, input().split()) # a와 b를 연결하는 비용이 c
    edge.append((c,a,b))

edge.sort()

result = 0
for i in range(M):
    cost, a, b = edge[i]
    if find_parent(a) != find_parent(b):
        union_parent(a, b)
        result += cost
print(result)
