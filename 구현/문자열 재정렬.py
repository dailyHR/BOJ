a = input()

s = sorted(list(a))


i = 0
num = 0
while True :
    # 알파벳인 경우 isalpha()로 검사가능
    if not s[i].isalpha():
        num += int(s[i])
        i += 1
    else:
        break

temp = s[i:]

if num != 0 :
    temp.append(str(num))

print(''.join(temp))
