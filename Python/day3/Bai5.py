for _ in range(int(input())):
    s = input()
    if(len(s) < 2):
        print("NO")
        continue
    if(s[-1] == '6' and s[-2] == '8'): print("YES")
    else: print("NO")