import numpy as np

A = np.array([[3, 2, 2], [4, 1, 5], [1, 2, 3]])
print("matrix A is : ", A)

B = np.array([[1, 2, 3], [1, 1, 1], [2, 2, 2]])
print("matrix B is: ", B)

print("multiplication of two matrices A&B is: ")

M = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

for i in range(len(A)):
    for j in range(len(B[0])):
        for k in range(len(B)):
            M[i][j] += A[i][k] * B[k][j]
for r in M:
    print([int(x) for x in r])
