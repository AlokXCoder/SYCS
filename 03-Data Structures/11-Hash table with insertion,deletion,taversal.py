hashTable = [[] for _ in range(10)]

def checkPrime(n):
    if n == 1 or n == 0:
        return 0
    for i in range(2, n//2):
        if n % i == 0:
            return 0
    return 1

def getPrime(n):
    if n % 2 == 0:
        n = n + 1
    while not checkPrime(n):
        n = n + 2
    return n

def hashFunction(key):
    capacity = 10
    return key % capacity

def insertData(key, data):
    index = hashFunction(key)
    hashTable[index].append([key, data])

def removeData(key):
    index = hashFunction(key)
    hashTable[index] = [x for x in hashTable[index] if x[0] != key]

insertData(123, "Iron Man")
insertData(432, "Thor")
insertData(213, "Odin")
insertData(654, "Zeus")

print(hashTable)

removeData(123)

print(hashTable)
