def display_hash(hashTable):
    for i in range(len(hashTable)):
        print(i, end=" ")
        for j in hashTable[i]:
            print(" --> ", end="")
            print(j, end="")
        print()

HashTable = [[] for _ in range(10)]

def Hashing(keyvalue):
    if not isinstance(keyvalue, int):
        raise ValueError("Key value must be an integer")
    return keyvalue % len(HashTable)

def insert(HashTable, keyvalue, value):
    hash_key = Hashing(keyvalue)
    HashTable[hash_key].append(value)

insert(HashTable, 10, 'Iron Man')
insert(HashTable, 11, 'Mr. Alok')
insert(HashTable, 21, 'Elliot')
insert(HashTable, 32, 'Dr Dooms')
insert(HashTable, 42, 'Jon Snow')
insert(HashTable, 52, 'Thanos')
insert(HashTable, 62, 'Black Panther')
insert(HashTable, 72, 'Will smith')

display_hash(HashTable)
