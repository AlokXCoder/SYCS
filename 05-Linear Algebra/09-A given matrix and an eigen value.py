import numpy as np

A = np.asmatrix("-2,1;12,-3")
print("A \n", A)

print("Eigen Values of A are: ", np.linalg.eigvals(A))

eigenvalues, eigenvectors = np.linalg.eig(A)
print("First set of Eigen Values: ", eigenvalues)
print("Eigen Vectors are: ", eigenvectors)
