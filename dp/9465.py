T = int(input())
# 이전 값을 선택하거나 현재 값을 선택함
for _ in range(T):
    N = int(input())
    
    if N == 1 :
        n1 = int(input())
        n2 = int(input())
        if n1 > n2 :
            print(n1)
        else: 
            print(n2)
    else:
        sticker = []
        dp = [[0] * N for _ in range(2)]
        for _ in range(2):
            sticker.append(list(map(int, input().split())))

        dp[0][0] = sticker[0][0]
        dp[1][0] = sticker[1][0]

        dp[0][1] = dp[1][0] + sticker[0][1]
        dp[1][1] = dp[0][0] + sticker[1][1]

        for i in range(2,N):
            dp[0][i] = max(
                max(dp[0][i-2], dp[1][i-2]) + sticker[0][i],
                dp[1][i-1] + sticker[0][i]
            )

            dp[1][i] = max(
                max(dp[0][i-2], dp[1][i-2]) + sticker[1][i],
                dp[0][i-1] + sticker[1][i]
            )
        print(max(max(dp[0]), max(dp[1])))
