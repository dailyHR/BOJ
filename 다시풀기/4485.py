import sys
import heapq

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
def dijkstra():
    q = []
    distance[0][0] = 0
    heapq.heappush(q, (cave[0][0], 0, 0))
    
    while q :
        dist, x, y = heapq.heappop(q)

        if x == N-1 and y == N-1 :
            print(f'Problem {count}: {distance[x][y]}')
            break
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and ny >=0 and nx < N and ny < N:
                cost = cave[nx][ny] + dist
                if cost < distance[nx][ny] :
                    distance[nx][ny] = cost
                    heapq.heappush(q, (cost, nx, ny))


count = 1

INF = int(1e9)

while True:
    cave = []
    N = int(input())
    if N == 0 :
        break

    for _ in range(N):
        cave.append(list(map(int, sys.stdin.readline().split())))

    distance = [[INF] * (N) for _ in range(N)]
    dijkstra()
    count += 1