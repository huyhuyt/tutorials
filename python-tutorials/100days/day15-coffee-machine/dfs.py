from collections import defaultdict
l = [['a','b'],['a','c'],['a','h'],['b','d'],['c','e'],['c','f'],['c','g'],['d','i'],['d','j']]

adj = {}
adj = defaultdict(list)
def build_adj(l:list)->dict:
    for u,v in l:
        if u not in adj:
            adj[u] = []
        adj[u].append(v)
    return adj

build_adj(l)

traversal = []
def dfs_recursive(graph:dict,node:str)->list:
    visited = set()
    visited.add(node)
    traversal.append(node)
    #print(graph[node])
    for nei in graph[node]:
        if nei not in visited:
            dfs_recursive(adj,nei)

    return traversal
def dfs_iterative(graph:dict,node:str)->list:
    visited = set()
    visited.add(node)
    stack = []
    stack.append(node)
    traversal = []

    while(stack):
        temp = stack.pop()
        traversal.append(temp)
        for nei in reversed(graph[temp]):
            if nei not in visited:
                stack.append(nei)
    return traversal

res = dfs_recursive(adj,"a")
print(f"dfs use recursive: {res}")
res = dfs_iterative(adj,"a")
print(f"dfs use iterative: {res}")