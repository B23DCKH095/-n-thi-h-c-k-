from datetime import datetime
n,m = map(int,input().split())
phim = {}
for i in range(n):
    phim[f"TL{str(i+1).zfill(3)}"] = input()

def ngay(s):
    return s[6:]+s[3:5] + s[0:2]
class sv:
    def __init__(self,id,tl,ngay,ten,tap):
        self.id = f"P{str(id+1).zfill(3)}"
        self.theloai = phim[tl]
        self.ngay = ngay
        self.ten = ten
        self.tap = int(tap)
    def __str__(self):
        return f"{self.id} {self.theloai} {self.ngay} {self.ten} {self.tap}"
a = []
for i in range(m):
    a.append(sv(i,input(),input(),input(),input()))
a.sort(key = lambda x : (ngay(x.ngay),x.ten,-x.tap))
for i in a:
    print(i)