import other_file

def show_info_number(number):
    if number %2 == 0:
        print(str(number) + " is even number\n")
    else:
        print(str(number) + " is odd number\n")
        
if __name__ == '__main__':
    num = 1
    while num != 0:
        num = int(input("Enter a number: or enter '0' to exit: "))
        show_info_number(num)