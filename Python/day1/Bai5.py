s = input()
thuong = 0
hoa = 0
for i in s:
    if(ord(i) < ord('a')): hoa += 1
    else: thuong += 1
if(hoa > thuong): print(s.upper())
else: print(s.lower())