def check(s):
    n = s
    if(n < 10): return False
    m = n
    rev = 0
    while(m> 0):
        tmp = m%10
        rev = rev*10 + tmp
        m //= 10
    return rev == n
for _ in range(int(input())):
    s = input()
    tong = 0
    for i in s:
        tong += int(i)
    if(check(tong)): print("YES")
    else: print("NO")