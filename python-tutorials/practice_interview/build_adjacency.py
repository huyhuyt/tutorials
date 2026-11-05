from collections import defaultdict

# reconstruct into adjacency list
edges_list = [['a','b'],['a','c'],['c','d'],['c','e']]

d = defaultdict(list)
for u,v in edges_list:
    d[u].append(v)

print(d)

seen = set()
#travel use recursive
def dfs_recursive(node):
    print(node)
    for nei_node in d[node]:
        if nei_node not in seen:
            seen.add(nei_node)
            dfs_recursive(nei_node)


def dfs_use_stack(node):
    pass

source = 'a'
dfs_recursive(source)
