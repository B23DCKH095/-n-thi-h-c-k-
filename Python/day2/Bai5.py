import re
n = int(input())
for _ in range(n):
    s = input()
    x = 99999999999999999
    for i in re.split("[^0-9]",s):
        if(i!= ''): x = min(int(i),x)
    print(x)