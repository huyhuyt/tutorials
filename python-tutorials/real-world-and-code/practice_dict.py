dict = {'a':1,
        'b':2,
        'c':3}
i = 50
for key in dict:
    print(key)

def foo():
    dict['c'] = 4
    i = 100
    return i

foo()
print(dict)
print(i)