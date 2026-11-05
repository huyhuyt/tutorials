import time
def find_two_consecutive_match_target_in_array(nums: list[int],target: int) -> list[int]:
    seen = set()
    max_sum_2 = 0
    for i in range(len(nums)):
        max_sum_2 = nums[i] + nums[i+1]
        print(max_sum_2)
        if max_sum_2 == target:
            return [i,nums[i]]


    return []

def second_alg(nums:list[int],target:int)->list[int]:
    s = {}
    for i,num in enumerate(nums):
        if target - num in s:
            return [s[target-num],i]
        s[num] = i
    return []

nums = [2,3,5,8,3,5,9,30,534,353]
target = 39
start_time = time.perf_counter()
#res = find_two_consecutive_match_target_in_array(nums,target)
res = second_alg(nums,target)
end_time = time.perf_counter()
execute_time = end_time - start_time

print(res)
print(f"Execute time: {execute_time:.06f} ms")