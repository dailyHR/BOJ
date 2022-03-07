from collections import deque

def bfs(queue):

    dx = [0,0,1,-1]
    dy = [1,-1,0,0]

    while queue:
        temp = queue.popleft()
        X = temp[0]
        Y = temp[1]
        visited[X][Y] = True
        value = graph[X][Y]
        for i in range(4):
            X = X + dx[i]
            Y = Y + dy[i]
            if X<0 or Y<0 or X>=N or Y>=M:
                X = X - dx[i]
                Y = Y - dy[i]
                continue
            else:
                if graph[X][Y] == 0 and visited[X][Y] == False:
                    queue.append([X,Y])
                    visited[X][Y] = True
                    graph[X][Y] = value+1
                X = X - dx[i]
                Y = Y - dy[i]




M, N = map(int , input().split())

graph = []
visited = [[False for col in range(M)] for row in range(N)]
for i in range(N):
    temp = list(map(int, input().split()))
    graph.append(temp)

queue = deque()
for i in range(N):
    for j in range(M):
        if graph[i][j] == 1:
            queue.append([i,j])

bfs(queue)

# graph에 0이 하나라도 있으면 토마토가 익지 않았다는 것.
# 따라서 0이 존재하면 flag를 -1로 설정하고 그렇지 않은 경우 max값 출력
flag = 0
for i in range(N):
    for j in range(M):
        if graph[i][j] == 0:
            flag = -1
            break
if flag == -1 :
    print(flag)
else:
    li = []

    for i in range(N):
        li.append(max(graph[i]))
    print(max(li)-1)

