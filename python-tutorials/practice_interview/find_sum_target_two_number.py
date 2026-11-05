l = [1,3,5,7,8,10,-1,30,35,53,2]
target = 12

#problem: find 2 numbers add up = target number
def find_sum(list_num:list[int], target: int)->list[int]:
    #how come to dictionary solution

    return []

#solution 2: sort array
#then use 2 pointer solution to find
l.sort()
left = 0
right = len(l) - 1
mid = len(l)//2
print(mid)
result = []
while left < mid:
    sum_num = l[left] + l[mid]
    if sum_num == target:
        result.append(left)
        result.append(right)
print(result)
