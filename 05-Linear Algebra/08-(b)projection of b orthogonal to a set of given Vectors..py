# Run this program with 8(A) 
v2 = [2.0, -4.0, -1.0]
x = [-9.0, -2, 1.0]

def make_unit_vec(u):
    import numpy as np
    bottom = np.linalg.norm(u)
    return u / bottom

b1 = make_unit_vec([-2.0, -3.0, -2.0])
print(b1)

r = oprojection(v2, b1)
print(r)

v2_perp = v2 - (r)[1]
b2 = make_unit_vec(v2_perp)
print(b2)

print("b1 and b2 are orthogonal or not:")
print(np.linalg.norm(b2))
print(np.dot(b1, b2))

p1 = np.outer(b1, b1)
print(p1)

p2 = np.outer(b2, b1)
print(p2)

p = p1 + p2
print(p)

t = np.dot(p, x)
