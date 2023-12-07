import math
lst = list(map(int, input().split()))

def check_alternative(lst, x):
    if lst[0] % x != 0:
        flag = False
    else:
        flag = True
    
    for ele in lst:
        if flag == True:
            if ele % x != 0:
                return False
            else:
                flag = False
        else:
            if ele % x == 0:
                return False
            else:
                flag = True

if __name__ == "__main__":
    x = -1
    for i in range(1, 1000000):
        if check_alternative(lst, i) == True:
            x = i
            break
    print(x)