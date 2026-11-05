#for array n interger
#get list all window have k consecutive number

def get_all_window(nums: list[int], k: int):
    all_window = []
    for i in range(len(nums)-k+1):
        all_window.append(nums[i:i+k])
    return all_window
def get_max(nums:list[list[int]]):
    max_list = []
    for item in nums:
        max_list.append(max(item))
    return max_list
l1 = [1,2,3,4,5]
print(get_all_window(l1,3))
all_window = []
all_window = get_all_window(l1,3)
print(get_max(all_window))