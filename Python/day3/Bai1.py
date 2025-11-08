prime = [1 for _ in range(1000001)]
for i in range(2,1000):
    for j in range(2*i,1000001,i):
        prime[j] = 0
prime[0] = prime[1] = 0
for _ in range(int(input())):
    n = int(input())
    cnt = 0
    for i in range(6,n,1):
        if(prime[i] == 1 and prime[i-4]== 1 and prime[i-6]== 1):cnt += 1
        if(prime[i] == 1 and prime[i-2]== 1 and prime[i-6]== 1):cnt += 1
    print(cnt)