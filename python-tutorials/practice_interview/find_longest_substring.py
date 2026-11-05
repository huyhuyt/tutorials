#problem
# abcdeaberererere
# find longest substring without duplicate character

def find_longest(s:str)->int:
    max_length = 0

    # we need to loop over char in string
    # we need something to track what char we iterate
    # here we use set (collection item not duplicate)

    char_set = set()

    #longest substring is windows from left index and right index
    # right - left + 1

    # we will move left and right when we iterate char
    left = 0
    for right in range(len(s)):
        while(s[right] in char_set):
            #we remove
            char_set.remove(s[right])
            left += 1
        char_set.add(s[right])
        print(char_set)
        max_length = max(max_length, len(char_set))
    return max_length

s = "abcdecuoirerem"
res = find_longest(s)
print(res)
