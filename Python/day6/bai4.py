n,m = map(int,input().split())
a = []
for i in range(n):
    x = list(map(int,input().split()))
    a.append(x)
mx = -99999999
mn = -mx
for i in range(n):
    for j in range(m):
        mn = min(mn,a[i][j])
        mx = max(mx,a[i][j])
x = []
dep = mx - mn
for i in range(n):
    for j in range(m):
        if(a[i][j] == dep): x.append(f'[{i}][{j}]')
if(len(x) == 0): print("NOT FOUND")
else:
    print(dep)
    for i in x:
        print(f"Vi tri {i}")