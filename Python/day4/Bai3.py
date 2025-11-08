n = int(input())
a = list(map(int,input().split()))
while(len(a) < n):
    a.extend(list(map(int,input().split())))
mp = []
cur = 1
for i in a:
    while(cur < i):
        mp.append(cur)
        cur += 1
    cur += 1
if(len(mp) == 0): print("Excellent!")
else:
    for i in mp:
        print(i)