import sys

def main():
    list_num = [12, 87, 99, 133 , 235, 333, 373, 434, 787, 888, 5454, 6456, 7678, 13430]
    low_index = 0
    high_index = len(list_num) - 1
    target = 2355
    num = binary_search(list_num, low_index, high_index, target)
    if num >=0:
        print(f"found {target} number in {list_num}")
    else:
        print(f"not found {target} number in {list_num}")

def binary_search(list_num, low_index, high_index, target):
    while high_index >= low_index:
        mid_index = low_index + (high_index - low_index) // 2
        if list_num[mid_index] == target: 
            return mid_index
        if list_num[mid_index] < target:
            #find on right array
            low_index = mid_index + 1
        else:
            high_index = mid_index - 1
    return -1

if __name__ == '__main__':
    sys.exit(main())