def find_first_pattern(s:str,p:str)->int:
    left = 0
    window = len(p)

    for right in range(len(s) - window + 1):
        if s[right:right+window] == p:
            return right
    return -1

def find_first(s:str,p:str)->int:
    left = 0
    right = len(p) - left



s="abcferjelrjlkewjr"
p="jlk"
res = find_first_pattern(s,p)
print(res)