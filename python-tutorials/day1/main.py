import json

# my_list = [1, 2, 3]
# with open("file.json", "w") as f:
#     json.dump(my_list, f)

# name = input("what is your name?\n")
# num_char = len(name)
# print("your name has " + str(num_char) + " character")
# print(type(num_char))

try: 
    with open("file.txt") as f:
        f.read()
except FileNotFoundError:
    print("File does not exist")
    
def say_name(husband, wife):
    print("husband name is " + husband + " and wife name is " + wife + "\n")
    
say_name("Kevin", "Kim")
say_name(wife="Kim", husband="kevin")
say_name("Kim", "kevin")

#for i in range(2,6):
#  print(i)
    
my_list = [2,3,6,67]
for i in range(len(my_list)):
    print(my_list[~i])