from collections import defaultdict
def find_longest(s:str)->int:
    seen = set()
    left = 0
    max_length = 0
    for right in range(len(s)):
        while s[right] in seen:
            seen.remove(s[left])
            left += 1
        max_length = max(max_length, right - left + 1)
        seen.add(s[right])

    return max_length

s = "abcdefdebdghtadb"
res = find_longest(s)
print(res)

test_dict = defaultdict(s)
for k,v in test_dict:
    print("Key {} and value {}",k,v)