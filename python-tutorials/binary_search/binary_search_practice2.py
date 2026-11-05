import sys

def main():
    list_num = [2, 3, 6, 10, 13, 34, 36, 45, 67, 78, 79, 80, 82, 88, 93]
    low_index = 0
    high_index = len(list_num) - 1
    target = 78
    index = binary_search(list_num, low_index, high_index, target)
    if index >=0: 
        print(f"found {target} number in list {list_num}")
    else:
        print(f"not found {target} in list {list_num}")

def binary_search(list_num, low_index, high_index, target):
    while high_index >= low_index:
        mid_index = low_index + (high_index - low_index) // 2
        if list_num[mid_index] == target:
            return mid_index
        if list_num[mid_index] > target:
            #look for left side
            high_index = mid_index - 1
        else:
            low_index = mid_index + 1
            
    return -1

if __name__ == '__main__':
    sys.exit(main())