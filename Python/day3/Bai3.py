
def calc(loai,ghe):
    if(loai == "Xe_con"):
        if(ghe == 5): return 10000
        if(ghe == 7): return 15000
    if(loai == "Xe_tai"):
        if(ghe == 2): return 20000
    if(loai == "Xe_khach"):
        if(ghe == 29): return 50000
        if(ghe == 45): return 70000
mp = {}
for _ in range(int(input())):
    a = list(map(str,input().split()))
    loai = a[1]
    ghe = int(a[2])
    tt = a[3]
    ngay = a[4]
    gia = 0
    if(tt == "OUT"):
        gia = 0
    else:
        gia = calc(loai,ghe)
    if(mp.get(ngay) == None): mp[ngay] = gia
    else: mp[ngay] += gia
for u in mp:
    print(u+':',mp[u])