#practice lambda, map and reduce

import math

def area(r):
    return math.pi * (r**2)

def main():
    rads = [2,3,5,10]
    # method 1
    areas = []
    for r in rads:
        ar = area(r)
        areas.append(ar)
      
    # method 2 use lambda
    areas_method_2 = list(map(area, rads))
    
    for a in areas_method_2:
        print(a)
        
    list_country = ["Brazil", "", "America", "Canada", "Australia", "Vietnam", ""]
    list_country_sort = list(filter(None, list_country))
    for x in list_country_sort:
        print(x)    

if __name__ == '__main__':
    main()    
    
    