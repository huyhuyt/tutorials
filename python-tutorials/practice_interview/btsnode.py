class BTSNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None
    def insert(self, key):
        if key == self.val:
            return
        if key < self.val:
            if self.left:
                self.left.insert(key)
            else:
                self.left = BTSNode(key)
        if key > self.val:
            if self.right:
                self.right.insert(key)
            else:
                self.right = BTSNode(key)
    def inorder_travel(self):
        elements = []
        if self.left:
            elements += self.left.inorder_travel()
        elements.append(self.val)
        if self.right:
            elements += self.right.inorder_travel()
        return elements


root = BTSNode(50)
data_to_store = [30, 20, 40, 70, 60, 80]
for item in data_to_store:
    root.insert(item)
t1 = root.inorder_travel()
print(t1)
