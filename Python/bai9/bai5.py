n , m = map(int,input().split())
a = []
for i in range(n):
    b = list(map(int,input().split()))
    a.append(b)
prime = [1 for i in range(1000)]
for i in range(2,1000):
    if[prime[i] == 1]:
        for j in range(2*i,1000,i):
            prime[j] = 0
prime[0] = prime[1] = 0
ret = []
mx = -1
for i in range(n):
    for j in range(m):
        if(prime[a[i][j]] == 1):
            if(a[i][j] > mx):
                ret = [f"[{i}][{j}]"]
                mx = a[i][j]
            elif(a[i][j] == mx):
                ret.append(f"[{i}][{j}]")
if(len(ret) == 0):
    print("NOT FOUND")
else:
    print(mx)
    for i in ret:
        print("Vi tri",i)
        