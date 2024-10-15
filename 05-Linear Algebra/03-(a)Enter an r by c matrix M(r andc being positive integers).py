import numpy as np

M = np.array([[1, 1, 1], [3, 4, 5], [9, 6, 3]])

print("matrix M is", M)

y = M[0:1]
print("first row of matrix M is", y)

x = M[0:2]
print("first two rows of matrix M is", x)

t = M[0:3]
print("all three rows of matrix M is:", t)
