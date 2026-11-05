#find sum consecutive k number in array and get max
def find_max(l: list[int], k: int)->int:
    window_sum = sum(l[:k])
    max_sum = window_sum
    for i in range(len(l) - k):
        window_sum = window_sum - l[i] + l[i+k]
        max_sum = max(max_sum,window_sum)

l = [0,1,2,3,4,5,6,7]