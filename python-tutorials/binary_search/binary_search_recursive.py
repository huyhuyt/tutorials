import sys

def main():
    num_list = [1, 5, 6, 8, 9, 10, 23, 34, 46, 57, 67, 89, 99, 100, 102]
    low_index = 0
    high_index = len(num_list) - 1
    target = 99
    sys.setrecursionlimit(1500)
    num = binary_search(num_list, low_index, high_index, target)
    if num >= 0:
        print(f"number {target} exists in list {num_list} at index {num}")
    else:
        print(f"number {target} does not exist in list {num_list}")

def binary_search(num_list, low_index, high_index, target):
    mid_index = low_index + (high_index - low_index) // 2
    print(f"value at mid_index {num_list[mid_index]}")
    if high_index >= low_index:
        if num_list[mid_index] == target:
            return mid_index
        if num_list[mid_index] > target:
            #search  on left side
            high_index = mid_index - 1
            return binary_search(num_list, low_index, high_index, target)
        
        #search on right side
        low_index = mid_index + 1
        return binary_search(num_list, low_index, high_index, target)
    return -1
    
if __name__ == '__main__':
    sys.exit(main())