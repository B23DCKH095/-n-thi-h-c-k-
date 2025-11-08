
class sv:
    def __init__(self,id,ten,khoi,d1,d2):
        self.id = f'GV{str(id).zfill(2)}'
        self.ten = ten
        self.diem = float(d2)*2 + float(d1)
        a = khoi[0]
        if(a == 'A'): self.khoi = "TOAN"
        elif(a == 'B'): self.khoi = "LY"
        else: self.khoi = "HOA"
        b = khoi[1]
        if(b == '1'): self.diem += 2.0
        elif(b == '2'): self.diem += 1.5
        elif(b == '3'): self.diem += 1
        if(self.diem >= 18.0): self.tt = "TRUNG TUYEN"
        else: self.tt = "TRUOT"
    def __str__(self):
        return f'{self.id} {self.ten} {self.khoi} {self.diem} {self.tt}'

a = []
for i in range(int(input())):
    a.append(sv(i+1,input(),input(),input(),input()))
a.sort(key= lambda x: (-x.diem))
for i in a:
    print(i)