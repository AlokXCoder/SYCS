import numpy as np
from numpy.linalg import inv

a = np.array([[1, 2], [3, 4]])
b = inv(a)
print(b)
