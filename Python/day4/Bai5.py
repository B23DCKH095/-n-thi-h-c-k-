s = input()
a = []
x = {}
for i in range(0,len(s),2):
    num = int(s[i:i+2])
    if(num < 10): continue
    if x.get(num) == None:
        x[num] = 1
    else:
        x[num]+= 1
for u in x:
    print(u,x[u])