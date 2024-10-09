class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):
        if self.isEmpty():
            raise ValueError("Queue is empty")
        return self.items.pop(0)

    def front(self):
        if self.isEmpty():
            raise ValueError("Queue is empty")
        return self.items[0]

    def size(self):
        return len(self.items)

q = Queue()

print("Queue Operations Example")
print(q.isEmpty())
q.enqueue(5)
q.enqueue("python")
print(q.front())
q.enqueue(True)
print(q.size())
print(q.isEmpty())
q.enqueue(11.5)
print(q.dequeue())
print(q.dequeue())
print(q.size())
