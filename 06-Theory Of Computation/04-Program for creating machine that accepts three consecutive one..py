def stateA(n):
    if n[0] == 'a':
        stateB(n[1:])
    elif n[0] == 'b':
        stateH(n[1:])

def stateB(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateC(n[1:])
        elif n[0] == 'b':
            stateI(n[1:])

def stateC(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateD(n[1:])
        elif n[0] == 'b':
            stateJ(n[1:])

def stateD(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateQ2(n)
        elif n[0] == 'b':
            stateE(n[1:])

def stateE(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateQ2(n)
        elif n[0] == 'b':
            stateF(n[1:])

def stateF(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateQ2(n[1:])
        elif n[0] == 'b':
            stateG(n[1:])

def stateG(n):
    if len(n) == 0:
        print("String Accepted")
    else:
        if n[0] == 'a':
            stateQ2(n)
        elif n[0] == 'b':
            stateQ2(n)

def stateH(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateI(n[1:])
        elif n[0] == 'b':
            stateK(n[1:])

def stateI(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateJ(n[1:])
        elif n[0] == 'b':
            stateL(n[1:])

def stateJ(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateE(n[1:])
        elif n[0] == 'b':
            stateM(n[1:])

def stateK(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateL(n[1:])
        elif n[0] == 'b':
            stateN(n[1:])

def stateL(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateM(n[1:])
        elif n[0] == 'b':
            stateO(n[1:])

def stateM(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateF(n[1:])
        elif n[0] == 'b':
            stateP(n[1:])

def stateN(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateO(n[1:])
        elif n[0] == 'b':
            stateQ1(n)

def stateO(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateP(n[1:])
        elif n[0] == 'b':
            stateQ1(n)

def stateP(n):
    if len(n) == 0:
        print("String Not Accepted")
    else:
        if n[0] == 'a':
            stateG(n[1:])
        elif n[0] == 'b':
            stateQ1(n[1:])

def stateQ1(n):
    print("String Not Accepted")

def stateQ2(n):
    print("String Not Accepted")

# Input string
n = "abaabb"
stateA(n)
