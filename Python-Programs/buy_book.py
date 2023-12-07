def print_data(name, ifsc, price, author, edition):
    print("--------------------")
    print("Serial Number -->", serial)
    print("Book name -->", name)
    print("IFSC Code -->", ifsc)
    print("Book Price --> Rs." + str(price))
    print("Author -->", author)
    print("Edition -->", str(edition) + " Edition")
    print("--------------------")

serial = 0
n = int(input())
for i in range(n):
    name = input()
    ifsc = input()
    price = int(input())
    author = input()
    edition = int(input())
    print_data(name, ifsc, price, author, edition)
    serial += 1