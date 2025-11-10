for _ in range(int(input())):
    n = int(input())
    v = 1
    r = 0
    while(n > 10):
        tmp = n%10 + r
        r = 0
        if(tmp >=5):r = 1
        v = v*10
        n //= 10
    if(r == 1): n+= 1
    print(n*v)