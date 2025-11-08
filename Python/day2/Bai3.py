mp = {}
def add(i):
    if(i not in mp): mp[i] = 1
    else: mp[i] += 1

n = int(input())
for i in range(n-1):
    u,v = map(int,input().split())
    add(u)
    add(v)
cnt = 0
for i in range(n+1):
    if(i not in mp): continue
    if(mp[i] == 1): cnt += 1
if(cnt== n-1): print("Yes")
else: print("No")