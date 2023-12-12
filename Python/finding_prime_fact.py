# Two functions - final
def isprime(i):
    j = 2
    isprime = True
    while(j <= i**(1/2)):
        if (i%j) == 0:
            isprime=False
        j = j + 1
    return isprime

def primefactors(x):
    i = 3
    while (i<= x):
        if isprime(i):
            if x%i == 0:
                print(i,"is a factor")
                while x%i == 0:
                    x = x//i
        i = i + 2

# Main Program
x=int(input("Give an Integer:"))
print("x: ", x)
if isprime(x):
    print(x, " is a prime")
else:
    #First repeatedly divide by 2 till it is odd no
    print("Prime factors are")
    if x%2==0:
        print("2 is a factor")
        while x%2 == 0:
            x = x // 2
    # Get prime factors of this odd no
    primefactors(x)