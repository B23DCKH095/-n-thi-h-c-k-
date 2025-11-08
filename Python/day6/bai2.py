for i in range(int(input())):
    print(f"Test {i+1}: ",end = "")
    s = sorted(input())
    t = sorted(input())
    if(s == t): print("YES")
    else: print("NO")