height = int(input())
# height = 12
height += 1

#          *
#         * **
#        * * * *
#       * * * * *
#      * * * ** * *
#     * * * * * * * *
#    * * * * * * * * *
#   * * * * * ** * * * *
#  * * * * * * * * * * * *


for i in range(1, height-2):
    for j in range(0, height-i-1):
        if j % (i+1) == 0:
            print(" ", end="")
        else:
            print("*", end="")
    print(" ", end="")
    print()


# counter = 0
# inner_counter = height
# while counter < height:
#     temp = inner_counter
#     i = 1
#     limit = 1 + counter
#     while inner_counter > 0:
#         if i == limit:
#             i = 1
#             print(" ", end="")
#         else:
#             print("*", end="")
#             i += 1
#         inner_counter -= 1
#     print()
#     inner_counter = temp - 1
#     counter += 1