import matplotlib.pyplot as plt

s = (3 + 3j, 4 + 3j, 2 + 1j, 5 + 1j, 2 + 1j)
angle = int(input("Enter angle rotation (90 or 180): "))

if angle == 90:
    sl = [x * 1j for x in s]
    X = [x.real for x in sl]
    Y = [x.imag for x in sl]
    plt.plot(X, Y, 'ro')
    plt.axis([-6, 6, -6, 6])
    plt.show()
elif angle == 180:
    sl = [x * -1 for x in s]
    X = [x.real for x in sl]
    Y = [x.imag for x in sl]
    plt.plot(X, Y, 'ro')
    plt.axis([-6, 6, -6, 6])
    plt.show()
else:
    print("Invalid angle")
