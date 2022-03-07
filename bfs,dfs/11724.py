import sys
sys.setrecursionlimit(10000)
def dfs(v):
    if visited[v] == True:
        return False
    else:
        visited[v] = True
        for value in graph[v] :
            dfs(value)
        return True


N, M = map(int, input().split())

graph = [[] for _ in range(N+1)]
visited = [False for _ in range(N+1)]
for i in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

count = 0
for i in range(1, len(graph)):
    if dfs(i) == True:
        count += 1

print(count)
