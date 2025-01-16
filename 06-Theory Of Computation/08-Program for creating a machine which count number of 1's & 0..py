def count_zeros_ones(s):
    count_0 = 0
    count_1 = 0
    for char in s:
        if char == '0':
            count_0 += 1
        elif char == '1':
            count_1 += 1
    return count_0, count_1

if __name__ == "__main__":
    s = input("Enter the string: ")
    count_0, count_1 = count_zeros_ones(s)
    print(f"Number of 0's: {count_0}")
    print(f"Number of 1's: {count_1}")