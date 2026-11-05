#!/usr/bin/env python3
import os
import requests
import re

print("practice regular expression")

job = "what position do you want to have in this company?"
pattern = r'a'
m = re.match(pattern, job)

def display(o):
    print(o)
    
display(m)

m = re.findall(pattern, job)

display(m)

class employee:
    pass

g = lambda x,y: x+y 
print(g(5,6))

animals = ['lion', 'cat', 'dog', 'bird', 'snake']
animals.sort()

for i in animals:
    print(i)