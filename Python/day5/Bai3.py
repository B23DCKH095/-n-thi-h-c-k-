n = int(input())
a = list(map(int,input().split()))
x= min(a)
a = sorted(a)
for i in a:
    if(i == x):
        x += 1
    else:
        break
print(x)