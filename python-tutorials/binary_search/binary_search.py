import sys

def main():
    list_number = [2, 4, 6, 7, 57, 67, 78, 90, 100, 101]
    #find target number in above list
    index_low = 0
    index_high = len(list_number) -1 
    target_number = 8
    num = binary_search(list_number, 0, index_high, target_number)
    if num >= 0:
        print(f"target number {target_number} found in {list_number} at index {num}")
    else: 
        print(f"not found {target_number} in {list_number}")

def binary_search(list_number, index_low, index_high, target) -> int:
    while(index_high >= index_low):
        mid_index = index_low + (index_high - index_low)//2
        if list_number[mid_index] == target:
            return mid_index
        if list_number[mid_index] > target:
            index_high = mid_index - 1
        else:
            index_low = mid_index + 1
    return -1

if __name__ == '__main__':
    sys.exit(main())