n = int(input())

i = 1
val = 1
if n == 1:
    print(1)
else:
    while True:
        num = 6 * i
        val += num
        if n <= val :
            i+=1
            break
        else:
            i+=1
    print(i)
