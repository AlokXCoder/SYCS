import numpy as np

x = np.array([5, 6, 7])
y = np.array([1, 2, 3])

print(x)
print(y)

print("Enter Values of a and b")

a = int(input())
b = int(input())

c = a * x + b * y
d = np.dot(x, y)

print("au+bv vector is: ", c)
print("dot product is: ", d)
