import re
n,m = map(int,input().split())
a = []
for i in range(n):
    s = re.split("[^a-z0-9]",input().lower())
    for x in s:
        if(x != ''): a.append(x)
mp = {}
for i in a:
    if(i not in mp): mp[i] = 1
    else: mp[i] += 1
a = list(set(a))
a.sort(key = lambda x: (-mp[x],x))
for i in a:
    if(mp[i] >= m): print(i,mp[i])