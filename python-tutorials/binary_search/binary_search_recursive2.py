import sys

def main():
    num_list = [1, 3, 5, 8, 9, 10, 13, 15, 32, 34, 45, 67, 78, 88, 100]
    low_index  = 0
    high_index = len(num_list) - 1
    target = 77
    index = binary_search(num_list, low_index, high_index, target)
    if index >= 0 :
        print(f"found {target} number in list {num_list} at index {index}")
    else: 
        print(f"not found {target} number in list {num_list}")

def binary_search(num_list, low_index, high_index, target):
    while(high_index >= low_index):
        mid_index = low_index + (high_index - low_index) // 2
        if num_list[mid_index] == target:
            return mid_index
        elif num_list[mid_index] > target:
            return binary_search(num_list, low_index, mid_index -1, target)
        else:
            return binary_search(num_list, mid_index+1, high_index, target)
    return -1

if __name__ == '__main__':
    sys.exit(main())