n,m,a = map(int,input().split())

r = m//a
if(m%a > 0): r += 1
l = n//a
if(n%a > 0): l += 1
print(l*r)