import math
def check(n:int):
    if(n < 2): return False
    for i in range(2,round(math.sqrt(n)+1),1):
        if(n%i == 0): return False
    return True
for _ in range(int(input())):
    ok = True
    n = int(input())
    if(not check(n)): ok = False
    if not check(int("".join(reversed(str(n))))): ok = False
    tong = 0
    while(n > 0):
        tmp = n%10
        if(not check(tmp)):
            ok = False
            break
        tong += tmp
        n//= 10
    if(not check(tong)): ok = False
    if(ok): print("Yes")
    else: print("No")