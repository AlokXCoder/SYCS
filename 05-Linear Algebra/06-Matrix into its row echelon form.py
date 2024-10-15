
from scipy.linalg import lu
import numpy as np

M = np.array([[1, 2, 3], [3, -1, 6], [7, 8, 9]])
p, l, u = lu(M)

print(u)
print(M)
