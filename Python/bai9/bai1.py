def tich(n :int):
    ret = 1
    while(n > 0):
        tmp = n%10
        ret *= tmp
        n //= 10
    return ret
for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    a.sort(key = lambda x: (tich(x),x))
    for i in a:
        print(i,end = " ")
    print("")