c = "0123456789ABCDEF"

for _ in range(int(input())):
    b = int(input())
    s = input()
    num = 0
    for i in s:
        num =num*2+ int(i)
    ret = ""
    while(num > 0):
        tmp = num%b
        ret += str(c[tmp])
        num //= b
    print("".join(reversed(ret)))