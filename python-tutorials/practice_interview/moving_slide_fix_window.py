l = [0,1,2,3,4,5]
#k=2
#output (0,1) (1,2) (2,3) (3,4) (4,5)
def move_k_window(l:list[int], k:int)->list[list[int]]:
    left = 0
    right = left + k -1
    res = []
    for left in range(len(l)):
        res.append(l[left:left+k])
    return res

k=2
res = move_k_window(l,k)
print(res)

l1 = [0,1,2,3,4,5]
l2 = l1[0:3]
print(l2)