# 플로이드 워셜 알고리즘 구현
# 모든 노드에서 다른 모든 노드까지의 최단 경로를 모두 계산.
# 노드의 개수가 적을 때 효과적
INF = int(1e9) # 무한을 의미하는 10억
n = int(input())
m = int(input())
graph = [[INF]*(n+1) for _ in range(n+1)]

# 자기 자신에서 자기 자신으로 가는 비용은 0
for a in range(1, n+1):
    for b in range(1, n+1):
        if a == b:
            graph[a][b] = 0

for _ in range(m):
    # A에서 B로 가는 비용은 C
    a,b,c = map(int, input().split())
    graph[a][b] = c

for k in range(1, n+1):
    for a in range(1, n+1):
        for b in range(1, n+1):
            graph[a][b] = min(graph[a][b], graph[a][k]+ graph[b][k])

for a in range(1, n+1):
    for b in range(1, n+1):
        if graph[a][b] == INF:
            print("INFINITY", end =" ")
        else:
            print(graph[a][b], end=" ")
    print()