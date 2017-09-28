def sumOfCubes(n):
    rtnLst = []
    X = Y = Z = 1
    cubeRootN = n**(1/3)
    #rN2 = rN // 1
    for X in range(1, int(cubeRootN) + 1): #Changed from 'n' to 'n**(1/3) + 1'
        for Y in range(1, int(cubeRootN) + 1):
            for Z in range(1, int(cubeRootN) + 1):
                if ((X**3) + (Y**3) + (Z**3)) <= n:
                    t = [X, Y, Z]
                    t.sort()
                    if t not in rtnLst:
                        rtnLst.append(t)
    return len(rtnLst)

print(sumOfCubes(1000000))
