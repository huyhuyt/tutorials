num_list = [0,1,2,3,4,5,6,7,8,9]
#len num_list is 10
num_length = len(num_list)
#window = 3
k = 3

for i in range(num_length - k + 1):
    print(num_list[i:i+k])