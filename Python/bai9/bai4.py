from decimal import Decimal
class sv:
    def __init__(self,id,ten,lt,th):
        self.ma = f"TS0{str(id)}"
        self.ten = ten
        d1 = Decimal(lt)
        d2 = Decimal(th)
        if(d1 > 10): d1 /= 10
        if(d2 > 10): d2 /= 10
        tb = (d1+d2)/2

        self.diem = tb
        self.trangthai = ""
        if(tb < 5): self.trangthai = "TRUOT"
        elif(tb < 8): self.trangthai = "CAN NHAC"
        elif(tb <= 9.5): self.trangthai = "DAT"
        else: self.trangthai = "XUAT SAC"
    def __str__(self):
        return f"{self.ma} {self.ten} {self.diem:.2f} {self.trangthai}"

a = []
for i in range(int(input())):
    a.append(sv(i+1,input(),input(),input()))
a.sort(key = lambda x: (-x.diem))
for i in  a:
    print(i)