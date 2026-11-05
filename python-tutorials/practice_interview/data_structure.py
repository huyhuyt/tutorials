import random
from collections import deque
#list mutable able to remove add
x = list()
x.append(1)
x.append(2)
print(x)

del(x[0])
print(x)

#tuple immutable - not able to remove/add or modify
y = (1,2,3)
z = 2,

print(y)
print(z)

a = tuple(x)
print(a)

#set non duplicate element
b= {3,5,3,6}
print(b)

s1 = {1,2,3}
s2 = {3,4,5}
#set math oper & | ^

#dictionary
x = dict(pork=25, beef=33, chicken=20)
print(x)

for k,v in x.items():
    print(k, v)

l1 = [i**2 for i in range(8) if i > 4]
print(l1)

l2 = [i for i in range(10) if i%2 == 1]
print(l2)

l3 = [i for i in range(20)]
print(l3[:5])
print(l3[4:])

for k,v in enumerate(l3):
    print(f"Index {k}, {v}")

lets = 'ABCDEFJ'
letters = list(lets)
random.shuffle(letters)
letrs = [a for a in letters if a != 'C']
print(letters)
print(letrs)

my_queue = deque()
my_queue.append(5)
my_queue.append(6)
print(my_queue)
my_queue.popleft()
print(my_queue)

#tree in list
l1 = [25,16,24,5,12,19,1,2,3,5,11]

class Node:
    def __init__(self, d , s):
        self.d = d
        self.s = s

class Robot:
    def __init__(self, name):
        self.name = name
    def introduce(self):
        print(f"Hello this is Robot {self.name}")

r1 = Robot("Wall-E")
r2 = Robot("Alien")
r1.introduce()
r2.introduce()