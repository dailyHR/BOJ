from collections import deque


N, M = map(int, input().split())
graph = []
for i in range(N) :
    graph.append(list(map(int,input())))

queue = deque([[0,0]])

dx = [1,-1,0,0]
dy = [0,0,1,-1]

while queue :
    temp = queue.popleft()
    x = temp[0]
    y = temp[1]
    value = graph[x][y] + 1
    for i in range(4):
        x = x+dx[i]
        y = y+dy[i]
        if x < 0 or y <0 or x >= N or y >= M :
            x = x-dx[i]
            y = y-dy[i]
            continue
        else :
            if graph[x][y] == 1 :
                graph[x][y] = value
                queue.append([x,y])
        x = x-dx[i]
        y = y-dy[i]
print(graph[N-1][M-1])



