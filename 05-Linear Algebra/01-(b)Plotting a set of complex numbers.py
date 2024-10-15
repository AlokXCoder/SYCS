import matplotlib.pyplot as plt

X = 3 + 2j
a = [-2 + 4j, -1 + 2j, 0 + 2j, 1 + 2j, 2 + 2j, -1 + 4j, 0 + 4j, 1 + 4j]
A = [x.real for x in a]
B = [x.imag for x in a]  # Corrected line

plt.scatter(A, B, color="blue")
plt.show()
