from collections import defaultdict
A = [['jfk', 'tokyo'], ['tokyo', 'italy'],['italy', 'vietnam'], ['italy', 'usa']]

D = defaultdict(list)
for u,v in A:
    D[u].append(v)
    print(f"{u} and {v}")

print(D)
print(A)
A.sort(reverse=True)
print(A)

d1 = {}
d1['student'] = 'A'
d1['last_name'] = "Nguyen"
d1['first_name'] = "Kevin"

if 'grade' not in d1:
    d1['grade'] = 'B'
print(d1)

# Regular dict approach (Boilerplate)
data = {}
for name, color in [("apple", "red"), ("banana", "yellow"), ("cherry", "red")]:
    if color not in data:
        data[color] = []
    data[color].append(name)
print(data)

# defaultdict approach
grouped_data = defaultdict(list)
for name, color in [("apple", "red"), ("banana", "yellow"), ("cherry", "red")]:
    grouped_data[name].append(color)  # Automatically creates an empty list [] if missing

print(grouped_data)
# Output: defaultdict(<class 'list'>, {'red': ['apple', 'cherry'], 'yellow': ['banana']})
