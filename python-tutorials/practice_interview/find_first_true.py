def find_first_true(l:list[bool])->bool:
    left,right = 0, len(l)
    expected_index = -1
    while left < right:
        mid = (left + right)//2
        if l[mid]:
            right = mid - 1
            expected_index = mid
        else:
            left = mid + 1
    return expected_index

l = [False, False, False, False ,False, True, True, True, True, True, True, True,True, True]
l = [True, True, True, True, True, True, True,True, True,False]
res = find_first_true(l)
print(res)