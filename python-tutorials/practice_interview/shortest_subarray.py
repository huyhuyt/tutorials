#find shorted sum subarray >= target
#use variable size window
#we loop with right pointer to run

def shorted_sum_sub(l:list[int],target:int)->int:
    min_num = len(l) +  1
    left = 0
    window_sum = 0

    for right in range(len(l)):
        window_sum += l[right]
        #print(window_sum)
        while window_sum >= target:
            #now we have size window but not sure it is min
            #
            window_sum -= l[left]
            min_num = min(min_num,right - left + 1)
            left += 1


    return min_num 

target = 7
l1 = [8,2,4,1,3,4,6,2]
l2 = [2,3,4,1,2,3]

res1 = shorted_sum_sub(l1,target)
#print(res1)
res2 = shorted_sum_sub(l2,target)
print(res2)
