l = []
l1 = []
l2 = []
l3 = []

grade = {'A+':10,'A':10,'A-':9,'B':8,'B-':7,'C':6,'C-':5,'D':4,'F':2}
x = [1,2,4]

def check(a):
    global flag2
    flag2 = True
    if a[0].isalnum:
        if a[1].isdigit:
            if a[2].isalpha:
                flag2 = True
            else:
                print('Incorrect Grade')
                flag2 = False
        else:
            print('Incorrect Credit')
            flag2 = False
    else:
        print('Incorrect Course_No')
        flag2 = False
    if int(a[1]) not in x:
        print('Incorrect Credit')
        flag2 = False

def sgpa(count):
    p = 0
    q = 0
    for i in range(count):
        print(l1[i]+': '+l3[i])
        p += int(l2[i])*grade[l3[i]]
        q += int(l2[i])
    return p/q

def Main():
    flag = True
    f = []
    count = 0
    while flag:
        a = list(map(str,input('Enter Course_No ,No_of_credits & Grade_Received: ').split()))
        count += 1
        if not(len(a)==3):
            break
        check(a)
        if flag2 == True:
            l1.append(a[0])
            l2.append(a[1])
            l3.append(a[2])
        if a == []:                         
            flag = False
    return count-1


a = Main()
print('SGPA :',sgpa(a))