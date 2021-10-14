#https://www.hackerrank.com/challenges/designer-door-mat/problem

inp=input()
n=int(inp.split()[0])
s=int(inp.split()[1])
for i in range(1,n//2+1):
    for j in range(n//2+1-i):
        print("---",end="")
    for k in range(2*i-1):
        print(".|.",end="")
    for l in range(n//2+1-i):
        print("---",end="")
    print()
for i in range((s-7)//2):
    print("-",end="")
print("WELCOME",end="")
for i in range((s-7)//2):
    print("-",end="")
print()
for i in range(0,n//2):
    for j in range(i+1):
        print("---",end="")
    for k in range(2*((n//2)-i)-1):
        print(".|.",end="")
    for l in range(i+1):
        print("---",end="")
    print()
