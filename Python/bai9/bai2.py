class sv:
    def __init__(self,id , ten,dau,cuoi):
        self.ma = f"KH{str(id).zfill(2)}"
        self.ten = ten
        so = cuoi - dau
        self.tien = 0
        if(so <= 50): self.tien = so*100*1.02
        elif(so <= 100): self.tien = 100*1.03*50 + (so - 50)*150*1.03
        else: self.tien = 50*1.05*100 + 50*150*1.05 + (so - 100)*200*1.05
    def __str__(self):
        return f"{self.ma} {self.ten} {round(self.tien)}"
    
n = int(input())
a = []
for i in range(n):
    ten = input()
    dau = input()
    cuoi = input()
    a.append(sv(i+1,ten,int(dau),int(cuoi)))
a.sort(key= lambda x: (-x.tien))
for i in range(n):
    print(a[i])