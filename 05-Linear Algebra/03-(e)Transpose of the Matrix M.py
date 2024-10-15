x = [[12, 7], [4, 5], [3, 8]]
t = [[0, 0, 0], [0, 0, 0]]

print("Original matrix:")
print(x)

print("Transpose of matrix:")
for i in range(len(x)):
    for j in range(len(x[0])):
        t[j][i] = x[i][j]

for r in t:
    print(r)
