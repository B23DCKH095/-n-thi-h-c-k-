import math
for _ in range(int(input())):
    s = input()
    u = int(s)
    v = int("".join(reversed(s)))
    if(math.gcd(u,v) == 1): print("YES")
    else: print("NO")