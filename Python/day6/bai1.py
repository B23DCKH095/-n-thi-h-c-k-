import sys

sys.stdin = open("MONTHI.in","r")

u = {}
for i in range(int(input())):
    a,b,c = input(),input(),input()
    u[a] = b
sys.stdin.close()
sys.stdin = open("CATHI.in","r")
class sv:
    def __init__(self,id,ngay,gio,phong):
        self.id = id
        self.ngay = ngay
        self.gio = gio
        self.phong = phong
    def __str__(self):
        return f"{self.id} {self.ngay} {self.gio} {self.phong}"
v = {}
for i in range(int(input())):
    a,b,c = input(),input(),input()
    id = f"C{str(i+1).zfill(3)}"
    v[id] = sv(id,a,b,c)
sys.stdin.close
sys.stdin = open("LICHTHI.in","r")

class lich:
    def __init__(self,ngay,gio,phong,mon,nhom,so):
        self.ngay = ngay
        self.gio = gio
        self.phong = phong
        self.mon = mon
        self.nhom = so
    def __str__(self):
        return f"{self.ngay} {self.gio} {self.phong} {self.mon} {self.nhom} {self.so}"
a = []
for i in range(int(input())):
    s = input()
    w = s.split(" ")
    ma = w[0]
    a.append(lich(v[ma].ngay,v[ma].gio,v[ma].phong,u.)