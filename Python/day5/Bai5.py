s = input()

cnt = 0
while(1):
    tong = 0
    for i in s:
        if(i =='-'): continue
        tong = ord(i) - ord('0')
    cnt += 1
    s = str(tong)
    if(len(s) == 1): break
print(cnt)