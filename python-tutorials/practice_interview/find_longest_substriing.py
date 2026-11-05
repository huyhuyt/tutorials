#find longest consecutive num
# [2,3,89,34,534,3,5,6,4]
# output 5 (2,3,4,5,6)
def find_longest(nums:list[int])->int:
    num_set = set(nums)
    max_length = 0

    for num in num_set:
        if (num - 1) not in num_set:
            current_num = num
            current_length = 1

            while(current_num + 1) in num_set:
                current_num += 1
                current_length += 1
            max_length = max(current_length, max_length)

    return max_length

nums = [2,93,94,3,89,34,534,3,5,6,4,90,87,91,92]
res = find_longest(nums)
print(res)