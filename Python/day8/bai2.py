n = int(input())
cnt = 0
quiz = ""
for i in range(n):
    s = input()
    if(s == ""):
        print(quiz+ ":",cnt-1)
        cnt = 0
        quiz = ""
        continue
    if(quiz == ""): quiz = s
    cnt += 1
    if(i == n-3): print(quiz+ ":",cnt+1)