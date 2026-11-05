#for sorted array
# create square sorted array in ascending order
# input [-3, -1, 0, 1, 2]
# output [0, 1, 1, 4, 9]

def sorted_square(nums: list[int]) -> list[int]:
    left = 0
    right = len(nums) - 1
    res = []
    while left <= right:
       # print(nums[left], nums[right])
        if abs(nums[left]) >= abs(nums[right]):
            print(abs(left), abs(right))
            res.append(nums[left] ** 2)
            left += 1
            print(res)
        else:
            res.append(nums[right] ** 2)
            right -=1
            print(res)
    res.reverse()
    return res
l1 = [-3, -1, 0, 1, 2]
l2 = [-4, -1, 2, 3, 5]
print(sorted_square(l1))