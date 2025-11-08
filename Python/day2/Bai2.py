import math
def check(n:int):
    if(n < 2): return False
    for i in range(2,round(math.sqrt(n))+1,1):
        if(n%i == 0): return False
    return True

for _ in range(int(input())):
    n = int(input())
    k = 0
    for i in range(n):
        if(math.gcd(i,n) == 1):
            k+= 1
    if(check(k)): print("YES")
    else: print("NO")