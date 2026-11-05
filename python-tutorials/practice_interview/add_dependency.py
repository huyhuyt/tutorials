from collections import defaultdict

d = defaultdict(list)

def addPackages(s:str, dps: list[str])->list[str]:
    #d[s].append(dps)
    dpset = set(dps)
    res = []
    for dpe in dps:
        if dpe in dpset:
            d[s].append(dpe)
    #d[s].append(res)
    print(d[s])
    return d[s]

s = "a"
dps = ["b","c"]
#dps = ["f"]
#r = addPackages(s,dps)


assert addPackages("a",["b","c"]) == ["b","c"]
assert addPackages("a",["d"]) == ["b","c","d"]
assert addPackages("b",["f"]) == ["f"]


