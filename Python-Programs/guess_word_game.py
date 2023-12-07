import random
flag = True

word_list = ['which','there','their','about','would','these','other','words','could','write','first',
    'water','after','where','right','think','three','years','place','sound','great','again','still','every',
    'small','found','those','never','under','might','while','house','world','below','asked','going','large',
    'until','along','shall','being','often','earth','began','since','study','night','light','above','paper']

x = random.choice(word_list)

def check_word_in_position(user_input):
    for j in range(len(x)):
        if x[j] == user_input[j]:
            p = user_input[j]
            print(p+" is in the correct position as well as in the word")

def check_letter_in_word(a):
    if a in x:
        w = a
        return w+" is in the word but in the wrong position"

while flag:
    a = input()
    if len(a) != 5:
        break
    check_word_in_position(a)
    for i in a:
        q = check_letter_in_word(i)
    if q is None:
        pass
    else:
        print(q)