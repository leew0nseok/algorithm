import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)  # 재귀 깊이 제한 증가

def dfs(x, y, m, n, ground):
    # 범위 벗어나거나 배추 없으면 종료
    if x < 0 or x >= m or y < 0 or y >= n or ground[x][y] == 0:
        return
    # 방문 처리 (배추 제거)
    ground[x][y] = 0
    # 상하좌우 탐색
    dfs(x-1, y, m, n, ground)  # 상
    dfs(x+1, y, m, n, ground)  # 하
    dfs(x, y-1, m, n, ground)  # 좌
    dfs(x, y+1, m, n, ground)  # 우

T = int(input().strip())
for _ in range(T):
    M, N, K = map(int, input().split())
    ground = [[0] * N for _ in range(M)]
    for _ in range(K):
        X, Y = map(int, input().split())
        ground[X][Y] = 1
    
    count = 0  # 지렁이 수
    for i in range(M):
        for j in range(N):
            if ground[i][j] == 1:
                dfs(i, j, M, N, ground)
                count += 1
    print(count)