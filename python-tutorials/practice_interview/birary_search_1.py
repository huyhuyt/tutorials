# for array and target number
# search number in array and match target, return index of that number.
# example: [1,2,3,5,6,8,9,10,45,68,69] target number = 6
# output index 4

# algorith
# pick middle index and compare number at this index with target
# if number > target so we don't need to find on right half of array
# now check middle of left half

def force_search(list_numbers: list[int], target: int)->int:
    for i in list_numbers:
        if i == target:
            return list_numbers.index(i)

def binary_search_iterative(list_numbers: list[int], target:int)->int:
    left = 0
    right = len(list_numbers) - 1
    while(left <= right):
        mid = (left + right) // 2
        if list_numbers[mid] == target:
            return mid
        if list_numbers[mid] > target:
            #we can skip check for half right of array
            right = mid - 1
        else:
            left = mid + 1
    return mid


def binary_search_recursive(l:list[int],target:int,left:int, right:int)->int:
    if left > right:
        return -1
    mid = (left +  right)//2
    if l[mid] == target:
        return mid
    elif l[mid] > target:
        return binary_search_recursive(l,target,left, mid - 1)
    else:
        return binary_search_recursive(l,target,mid + 1,right)

l = [1,2,3,5,6,8,9,10,45,68,69]
target = 45
left = 0
right = len(l) - 1
res = force_search(l,target)
#print(res)

res = binary_search_iterative(l,target)
print(res)

res = binary_search_recursive(l,target,left,right)
print(res)

