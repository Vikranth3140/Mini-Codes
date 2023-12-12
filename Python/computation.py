import math
lst = list(map(int, input().split()))

def computation(lst, number):
    count = 0
    for i in range(len(lst)):
        if lst[i] == number:
            count += 1
    if count % 2 == 0:
        return True
    else:
        return False

if __name__ == "__main__":
    flag = True
    if len(lst)%4 != 0:
        flag = False
    for i in range(len(lst)):
        if computation(lst, lst[i]) == False:
            flag = False
            break
    if flag == True:
        print("YES")
    else:
        print("NO")