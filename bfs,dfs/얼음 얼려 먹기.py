def dfs(graph, x, y):
    if x < 0 or y < 0 or x >= N or y >= M :
        return False

    # 주변의 상, 하, 좌, 우를 살피고 값이 0이면 해당 지점 방문(=1)
    # 반복해서 상, 하, 좌, 우를 살피고 연결된 모든 지점을 방문
    # 방문하지 않은 지점의 수를 카운트
    if graph[x][y] == 0 :
        graph[x][y] = 1
        dfs(graph, x-1, y)
        dfs(graph, x+1, y)
        dfs(graph, x, y-1)
        dfs(graph, x, y+1)
        return True
    else:
        return False


N, M = map(int, input().split())

graph = []
for i in range(N):
    graph.append(list(map(int, input())))

result = 0
for i in range(N):
    for j in range(M):
        if dfs(graph, i, j) == True:
            result += 1

print(result)
