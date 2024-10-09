class PriorityQueueNode:
    def __init__(self, value, pr):
        self.data = value
        self.priority = pr
        self.next = None

class PriorityQueue:
    def __init__(self):
        self.front = None

    def isEmpty(self):
        return self.front is None

    def push(self, value, priority):
        newNode = PriorityQueueNode(value, priority)
        if self.isEmpty() or self.front.priority > priority:
            newNode.next = self.front
            self.front = newNode
        else:
            temp = self.front
            while temp.next and temp.next.priority <= priority:
                temp = temp.next
            newNode.next = temp.next
            temp.next = newNode

    def pop(self):
        if self.isEmpty():
            return None
        removed_node = self.front
        self.front = self.front.next
        return removed_node.data

    def peek(self):
        if self.isEmpty():
            return None
        return self.front.data

    def traverse(self):
        if self.isEmpty():
            print("Queue is Empty!")
        else:
            temp = self.front
            while temp:
                print(temp.data, end=" ")
                temp = temp.next
            print()

if __name__ == "__main__":
    pq = PriorityQueue()
    pq.push(4, 1)
    pq.push(5, 2)
    pq.push(6, 3)
    pq.push(7, 0)
    pq.traverse()
    pq.pop()
    pq.traverse()
