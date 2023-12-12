import math
lst = list(map(int, input().split()))

def sum(lst):
    if len(lst) == 0:
        return 0
    else:
        sum = 0
        for i in range(len(lst)):
            sum += lst[i]
        return sum

def middle(lst):
    if len(lst) == 0:
        return 0
    else:
        if len(lst) % 2 == 0:
            return lst[len(lst)//2 - 1]
        else:
            return lst[len(lst)//2]

#  A special number is a number that is closest in the list to the mean ceil value.
def special_number(lst):
    if len(lst) == 0:
        return 0
    else:
        mean = sum(lst)/len(lst)
        mean = math.ceil(mean)
        diff = abs(lst[0] - mean)
        special = lst[0]
        for i in range(len(lst)):
            if abs(lst[i] - mean) <= diff:
                diff = abs(lst[i] - mean)
                special = lst[i]

        return special

mean = sum(lst)/len(lst)
median = middle(lst)
special = special_number(lst)
print(int(mean), median, special)