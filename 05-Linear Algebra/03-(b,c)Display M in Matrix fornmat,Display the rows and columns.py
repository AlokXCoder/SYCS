import numpy as np

M = np.array([[1, 1, 1], [3, 4, 7], [9, 6, 3]])
print("Matrix M is", M)

y = M[:, 0:1]
print("First column of matrix M is", y)

x = M[:, 0:2]
print("First two columns of matrix M is", x)

t = M[:, 0:3]
print("All three columns of matrix M is", t)
