class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insertAtBeginning(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    def insertAfter(self, prev_node, new_data):
        if prev_node is None:
            print("The given Previous node must be in Linked List.")
            return
        new_node = Node(new_data)
        new_node.next = prev_node.next
        prev_node.next = new_node

    def insertAtEnd(self, new_data):
        new_node = Node(new_data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while(last.next):
            last = last.next
        last.next = new_node

    def deleteNode(self, position):
        if self.head is None:
            return
        temp = self.head
        if position == 0:
            self.head = temp.next
            temp = None
            return
        for i in range(position - 1):
            temp = temp.next
            if temp is None:
                break
        if temp is None:
            return
        if temp.next is None:
            return
        next = temp.next.next
        temp.next = None
        temp.next = next

    def printList(self):
        temp = self.head
        while(temp):
            print(str(temp.data), end=" ")
            temp = temp.next

if __name__ == '__main__':
    list = LinkedList()
    list.insertAtEnd(1)
    list.insertAtBeginning(2)
    list.insertAtBeginning(3)
    list.insertAtEnd(4)
    list.insertAfter(list.head.next, 5)
    print("Linked List")
    list.printList()
    print("\nAfter deleting an element")
    list.deleteNode(2)  # Delete the node at position 2
    list.printList()
    print()
