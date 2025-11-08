mp = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for _ in range(int(input())):
    x,b = map(int,input().split())
    ret = ""
    while(x > 0):
        tmp = x%b
        ret += mp[tmp]
        x //= b
    print("".join(reversed(ret)))