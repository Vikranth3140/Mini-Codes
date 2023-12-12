import math
lst = list(map(int, input().split()))

#gcd of whole list
def gcd(lst):
    if len(lst) == 0:
        return 0
    else:
        gcd = 0
        for i in range(len(lst)):
            gcd = math.gcd(gcd, lst[i])
        return gcd

gcd = gcd(lst)
print(gcd)