a = [1]
cur = 1
for i in range(1,10):
    cur *= i
    a.append(cur)
for _ in range(int(input())):
    n = int(input())
    m = n
    tong = 0
    while(m > 0):
        tmp = m%10
        tong += a[tmp]
        m //= 10
    if(n == tong): print("Yes")
    else: print("No") 