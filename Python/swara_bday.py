invt_ppl = []

def swar_bday(invt_ppl):
    flag = True
    while flag:
        x = input("Enter people's names : ")
        invt_ppl.append(x)

        if x == '':
            flag = False
            invt_ppl.pop()

    return invt_ppl

a = swar_bday(invt_ppl)
print(a)