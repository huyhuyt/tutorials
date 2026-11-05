from collections import defaultdict

l = [['a','b'],['a','c'],['b','d'],['b','e'],['c','f'],['c','g'],['g','h']]

#adj = {}
adj = defaultdict(list)

def build_adjacency(l:list)->dict:
    for u,v in l:
    #if u not in adj:
        #adj[u] = []
        adj[u].append(v)
    return adj

def dfs_recursive(graph:dict, node:str):
    visited = set()
    visited.add(node)
    print(node)
    for nei in graph[node]:
        if nei not in visited:
            dfs_recursive(graph,nei)

def dfs_iter(graph:dict,node:str):
    stack = []
    visited = set()
    stack.append(node)
    visited.add(node)
    while(stack):
        temp = stack.pop()
        print(temp)
        for nei in graph[temp]:
            if nei not in visited:
                visited.add(nei)
                stack.append(nei)
def dfs_iter1(graph:dict,node:str):
    stack = []
    visited = set()
    stack.append(node)
    visited.add(node)
    while(stack):
        temp = stack.pop()
        print(temp)
        if temp not in visited:
            visited.add(temp)
        for nei in graph[temp]:
            if nei not in visited:
                stack.append(nei)

build_adjacency(l)
dfs_recursive(adj,"a")
dfs_iter1(adj,"a")



