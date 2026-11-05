#for array find k consecutive number have max average
[-4, 3, 2, 7, 9, -10, 12]

#algorithm sliding windows
def calculate_k_consecutive_ave(nums: list[int], k: int) -> float:
    cur_sum = 0
    n = len(nums)
    for i in range(k):
        cur_sum += nums[i]
    max_ave = cur_sum/k
    for i in range(k,n):
        cur_sum += nums[i]
        cur_sum -= nums[i-k]
        ave = cur_sum/k

        max_ave = max(max_ave, ave)
    return max_ave

l1 = [2,-4,3,6,-5,7,8,0,10,32,-58,100]

res = calculate_k_consecutive_ave(l1,4)

print(res)
