l1 = [i for i in range(10)]

for i,v in enumerate(l1):
    print(i, v)

d1 = {'A': ('A', 'B'),
      'B': ('B', 'C'),
      'C': ('D', 'E')}

for k,v in d1.items():
    print(k, v)

t1 = tuple(l1)
print(l1)
print(t1)