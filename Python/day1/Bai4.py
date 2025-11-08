gt = [1,1,2,6,24,120,720,5040,40320,362880]
for _ in range(int(input())):
    s = input()
    n = int(s)
    tong = 0
    for i in s:
        tong += gt[int(i)]
    if(s == str(tong)): print("Yes")
    else: print("No")