#remove item from list if item match value
def remove_element(nums: list[int], val: int) -> int:
    count = 0
    res = 0
    for item in nums:
        if item == val:
            nums.remove(item)
            count += 1
    return count

l1 = [1,2,3,5,3,6,7,3,8]
val = 3
dup = remove_element(l1,val)
print(dup)
print(len(l1))
res = len(l1) - dup
print(res)