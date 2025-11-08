
for _ in range(int(input())):
    s = input()
    t = "".join(reversed(s))
    ok = True
    for i in range(1,len(s)):
        if(abs(ord(s[i]) - ord(s[i-1])) != abs(ord(t[i]) - ord(t[i-1]))): ok = False
    if(ok): print("YES")
    else: print("NO")