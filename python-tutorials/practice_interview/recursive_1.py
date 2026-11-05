def recur(i:int)->int:
    if i == 10:
        return 1
    return recur(i+1)
n=7
res = recur(n)
print(res)