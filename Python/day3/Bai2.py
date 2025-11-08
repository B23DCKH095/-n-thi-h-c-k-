def check(n):
    if(n < 10): return False
    rev = 0
    m = n
    while(m > 0):
        tmp = m%10
        rev = rev*10 + tmp
        m//= 10
    return rev == n
n,m = map(int,input().split())
a = []
for i in range(n):
    x = list(map(int,input().split()))
    a.append(x)
mp = []
mx = -10000
for i in range(n):
    for j in range(m):
        if(check(a[i][j])):
            if(a[i][j] > mx):
                mx = max(mx,a[i][j])
                mp = [f'[{i}][{j}]']
            elif(a[i][j] == mx):
                mp.append(f'[{i}][{j}]')
if(len(mp) == 0):
    print("NOT FOUND")
else:
    print(mx)
    for x in mp:
        print("Vi tri",x)