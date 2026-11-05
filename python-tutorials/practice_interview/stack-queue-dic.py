from collections import defaultdict
from collections import deque
l = [3,4,5,6,7]
l.pop()
print(l)
s = set(l)
s1 = {1,3,5,6,7,6}
print(s)
print(s1)

l1 = [['a','b'],['a','c'],['b','d'],['b','e'],['c','f'],['c','g'],['g','h']]
print(len(l1))

#convert to adajency list
d = defaultdict(list)
e = []
for i in l1:
    print(i)


for u,v in l1:
    print(u, v)
    d[u].append(v)
print(d)
l2 = ['a']
q1 = deque([])
for nei in d['a']:
    q1.append(nei)
    l2.append(nei)
q1.append('t')
print(q1)
print(l2)

#bfs travel
# a b c d e f g h
def bfs(graph, node):
  visited = set()
  queue = deque([node])
  print("START HERE")
  while queue:
      current = queue.popleft()
      print(current)

      for nei in graph[current]:
          print(graph[current])
          if nei not in visited:
              visited.add(nei)
              queue.append(nei)
              print(queue)

bfs(d,'a')


