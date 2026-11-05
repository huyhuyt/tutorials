import calculations

print("calculation sum of 2 number")
a = input("Enter first number: ")
b = input("Enter second number: ")

total = calculations.sum2num(int(a), int(b))
print("sum of 2 number are : " + str(total))