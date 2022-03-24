# N개의 집과 그 집들을 연결하는  M개의 길로 이루어졌고, 길을 유지하는 유지비.
def find_parent(x):
    if parent[x] != x:
        parent[x] = find_parent(parent[x])
    return parent[x]

def union_parent(a, b):
    a = find_parent(a)
    b = find_parent(b)
    if a<b :
        parent[b] = a
    else:
        parent[a] = b

N, M = map(int, input().split())
parent = [0] * (N+1)

for i in range(1, N+1):
    parent[i] = i

edge = []
for i in range(M):  
    A, B, C = map(int, input().split())
    edge.append((C, A, B))

edge.sort()
result = 0
max_val = 0
for i in range(M):
    cost, a, b = edge[i]
    if find_parent(a) != find_parent(b):
        result += cost
        max_val = max(max_val, cost)
        union_parent(a, b)

print(result - max_val)

