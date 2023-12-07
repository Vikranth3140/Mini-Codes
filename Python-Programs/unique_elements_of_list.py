x = [1,1,2,3,4,4,4,5,6,7,7,7,8,9,9,9]
l = []
x.sort()
for i in x:
    counter = 0
    for j in x:
        if i == j:
            counter += 1
    if counter == 1:
        l.append(i)
print(l)