from collections import defaultdict
from collections import deque

tree = [['A','B'],['A','C'],['C','E'],['C','F'],['B','D'],['B','K'],['D','G'],['G','K'],['K','L'],['G','H'],['L','H'],['H','G']]
tree = [['A','B'],['A','C'],['C','E'],['C','F'],['B','D'],['B','K'],['D','G'],['G','K'],['K','L'],['G','H'],['L','H']]

#build adjacency list
def build_adj_list(l:list)->dict:
    d = {}
    d = defaultdict(list)
    verticles = set()
    for k,v in tree:
        verticles.add(k)
        verticles.add(v)
    for i in verticles:

        #print(f"key {k} and value {v}")
        #d1[k].append(v)
        #if k not in d:
         #   d[k] = []
        d[i] = []
    #adj = {vertex:[] for vertex in verticles}
    #d = adj
    for k,v in tree:
        d[k].append(v)
    return d

#{'A': ['B', 'C'], 'C': ['E', 'F'], 'B': ['D', 'K'], 'D': ['G'], 'G': ['K', 'H'], 'K': ['L'], 'L': ['H']}
def dfs_algo(graph:dict,node:str)->list:
    stack = []
    stack.append(node)
    visited = set()
    res = []
    while stack:
        popEle = stack.pop()
        #print(popEle)
        if popEle not in visited:
            visited.add(popEle)
            res.append(popEle)
        for neighbor in graph[popEle]:
            if neighbor not in visited:
                stack.append(neighbor)
    return res

def bfs_travelsal(graph:dict,node:str)->list:
    visited = set()
    queue = deque()
    queue.append(node)
    res = []
    while queue:
        popElement = queue.popleft()
        if popElement not in visited:
            visited.add(popElement)
            res.append(popElement)
        for neighbor in graph[popElement]:
            if neighbor not in visited:
                #visited.add(neighbor)
                queue.append(neighbor)

    return res



adj_list = build_adj_list(tree)
print(adj_list)
res = dfs_algo(adj_list, 'A')
print(res)

res = bfs_travelsal(adj_list,'A')
print(res)

tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
print(tickets)
tickets.sort()
print(tickets)
tickets.sort(reverse=True)
print(tickets)

l = [1,2,3,4,5]
l = l[::2]
print(l)