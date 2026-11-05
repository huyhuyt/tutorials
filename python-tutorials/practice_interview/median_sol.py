class median_sol:
    def find_all_window(self,nums:list[int], k: int)->list[list[int]]:
        n = len(nums)
        res = []
        for i in range(n-k+1):
            res.append(nums[i:i+k])
        return res
    def find_median(self,nums:list[int])->float:
        n = len(nums)
        median = 0
        if n%2 == 0:
            median = (nums[n%2] + nums[n%2-1])/2
        else:
            median = nums[n%2]
        return median
arr = [0,1,2,3,4,5,6,7,8,9]
m = median_sol()
all_window = m.find_all_window(arr,3)
res = []
median = 0
for i in all_window:
    print(i)
    median = m.find_median(i)
    res.append(median)
print(res)