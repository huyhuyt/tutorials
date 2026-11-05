#for sorted array, find sum 2 numbers match target

def find_sum(nums: list[int], target: int) -> tuple[int, int]:
    left = 0
    right = len(nums) - 1
    while(left < right):
        current_sum = nums[left] + nums[right]
        if current_sum == target:
            return (nums[left],nums[right])
        elif current_sum < target:
            #right num is too large
            left += 1
        else:
            right -= 1
    return None

#l1 = [i for i in range(100)]
#target = 81
l1 = [3,2,4]
target = 6
print(find_sum(l1,target))

e1 = enumerate(l1)
for i,v in e1:
    print(i,v)
print(type(e1))