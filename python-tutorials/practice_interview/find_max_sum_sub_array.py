# problem: for array int
# and target k
# find consecutive k number has max sum

# example [1,2,1,5,6,2,3,6]
# sum [4,8,12,13,11,11]
# output 13

nums = [1,2,1,5,6,2,3,6]
k = 3

def find_max_sum(nums: list[int], k:int)->int:
    max_sum = 0
    len_nums = len(nums)
    for i in range(len_nums-k+1):
        current_sum = sum(nums[i:i+k])
        max_sum = max(max_sum,current_sum)
    return max_sum

#optimize
def opt_find_max_sum(nums: list[int], k:int)->int:
    current_sum = sum(nums[:k])
    for i in range(len(nums) -k):
        current_sum -= nums[i]
        current_sum += nums[i+k]

res = find_max_sum(nums,k)
print(res)