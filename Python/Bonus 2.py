# height = int(input())
height = 15

#          *
#         <>*
#        <> <>
#       <> * <>
#      <> <>* <>
#     <> <> <> <>
#    <> <> * <> <>
#   <> <> <>* <> <>
#  <> <> <> <> <> <>

later_space = 0
space = 0
inner_count = 0
prev = 0
for i in range(0, height):
    for j in range(0, height-i-1):
        print(" ", end="")
    print(" ", end="")
    space = space + 1
    if space == 4:
        space = 1
        inner_count = inner_count + 1
    if (prev == inner_count):
        for l in range(0, inner_count):
            print("<> ", end="")
    else:
        print("<>", end="")
        for l in range(0, inner_count-1):
            print(" <>", end="")
        prev = inner_count
    counter = later_space % 3
    if counter == 2:
        counter = 1
    for k in range(0, counter):
        print("<>", end="")
    if i > 0:
        counter = later_space % 3
        # for k in range(0, counter-1):
        #     print("<>", end="")
        for l in range(0, inner_count):
            print(" <>", end="")
        print(" ", end="")
    later_space = later_space + 1

    print()
