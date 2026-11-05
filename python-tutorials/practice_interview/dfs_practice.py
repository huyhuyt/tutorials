class TreeNode:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

    def __str__(self):
        return str(self.value)

#.   1
#. 2.  3
# 4. 5.  10

A = TreeNode(1)
B = TreeNode(2)
C = TreeNode(3)
D = TreeNode(4)
E = TreeNode(5)
F = TreeNode(10)

A.left = B
B.left = D
B.right = E
A.right = C
C.left = F

def pre_order_travelsal(node):
    if not node:
        return
    print(node)
    pre_order_travelsal(node.left)
    pre_order_travelsal(node.right)

pre_order_travelsal(A)

def in_order_travelsal(node):
    if not node:
        return
    in_order_travelsal(node.left)
    print(node)
    in_order_travelsal(node.right)

in_order_travelsal(A)

def post_order(node):
    if not node:
        return
    post_order(node.left)
    post_order(node.right)
    print(node)

post_order(A)
