import math

def isSquareRoot(n):
    return n**0.5 == int(n**0.5)
N = int(input())

if N == 1:
    print(1)
elif N==2 :
    print(2)
elif N==3 :
    print(3)
else:
    dp = [100001] * (N+1)
    # dp[i] : i의 제곱수들의 합 최소 경우

    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    dp[3] = 3

    for i in range(4, N+1):
        if isSquareRoot(i):
            dp[i] = 1
        else :
            val = math.floor(math.sqrt(i))
            for j in range(val, 1, -1):
                # dp[12]일 경우, 12의 제곱근부터 시작해서 최소값을 찾아냄
                dp[i] = min( dp[j**2] + dp[i-j**2], dp[i] )

    print(dp[N])
