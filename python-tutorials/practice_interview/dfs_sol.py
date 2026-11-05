from collections import defaultdict
edges_list = [[0,1],[0,3],[1,2],[3,6],[3,7],[3,4],[4,5],[4,2],[4,5],[5,2]]
#N = 8
#E = 10
print(len(edges_list))
n = len(edges_list)
#build matrix adajency
m = []
#build matrix with all 0 value
for i in range(n):
    m.append([0]*n)

#now fill in connection
for u,v in edges_list:
    m[u][v] = 1
print(m)

#build adjacency list
d = defaultdict(list)
for u,v in edges_list:
    d[u].append(v)
print(d)


def dfs_recursive(node):
    print(node)
    print("hello", seen)
    for nei_node in d[node]:
        if nei_node not in seen:
            seen.add(nei_node)
            dfs_recursive(nei_node)

source = 0
seen = set()
seen.add(source)
dfs_recursive(source)

