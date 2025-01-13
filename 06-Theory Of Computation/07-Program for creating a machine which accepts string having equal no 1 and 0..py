def getSubStringWithEqual012(s):
    arr = []
    n = len(s)
    for i in range(n):
        for j in range(i, n):
            s1 = ""
            for k in range(i, j + 1):
                s1 += s[k]
            arr.append(s1)
    
    count = 0
    for i in range(len(arr)):
        countZero = 0
        countOne = 0
        countTwo = 0
        curs = arr[i]
        for j in range(len(curs)):
            if curs[j] == '0':
                countZero += 1
            if curs[j] == '1':
                countOne += 1
            if curs[j] == '2':
                countTwo += 1
        if countZero == countOne and countOne == countTwo:
            count += 1
    
    return count

Str = input("Enter a string of digits: ")
print(getSubStringWithEqual012(Str))
