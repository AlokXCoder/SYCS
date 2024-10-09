class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node

    def insert_at_end(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node
            new_node.prev = current

    def insert_after_position(self, data, position):
        new_node = Node(data)
        if position < 0:
            print("Invalid position")
            return
        elif position == 0:
            self.insert_at_beginning(data)
            return
        else:
            current = self.head
            count = 0
            while current is not None and count < position - 1:
                current = current.next
                count += 1
            if current is None:
                print("Position out of range")
            else:
                new_node.next = current.next
                new_node.prev = current
                if current.next is not None:
                    current.next.prev = new_node
                current.next = new_node

    def delete_by_key(self, key):
        current = self.head
        if current is None:
            print("List is empty")
            return
        if current.data == key:
            self.head = current.next
            if self.head is not None:
                self.head.prev = None
            return
        while current is not None and current.data != key:
            current = current.next
        if current is None:
            print("Key not found in the list")
            return
        if current.next is not None:
            current.next.prev = current.prev
        if current.prev is not None:
            current.prev.next = current.next

    def delete_at_position(self, position):
        if self.head is None:
            print("List is empty")
            return
        current = self.head
        if position == 0:
            self.head = current.next
            if self.head is not None:
                self.head.prev = None
            return
        count = 0
        while current is not None and count < position - 1:
            current = current.next
            count += 1
        if current is None:
            print("Position out of range")
            return
        if current.next is not None:
            current.next.prev = current.prev
        if current.prev is not None:
            current.prev.next = current.next

    def forward_traversal(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()

    def backward_traversal(self):
        current = self.head
        if current is None:
            return
        while current.next is not None:
            current = current.next
        while current is not None:
            print(current.data, end=" ")
            current = current.prev
        print()

if __name__ == "__main__":
    dll = DoublyLinkedList()
    dll.insert_at_beginning(3)
    dll.insert_at_beginning(2)
    dll.insert_at_beginning(1)
    dll.insert_at_end(4)
    dll.insert_at_end(5)
    dll.insert_after_position(10, 2)
    print("Forward traversal:")
    dll.forward_traversal()
    print("Backward traversal:")
    dll.backward_traversal()
    dll.delete_by_key(10)
    dll.delete_at_position(3)
    print("Forward traversal after deletion:")
    dll.forward_traversal()
    print("Backward traversal after deletion:")
    dll.backward_traversal()
