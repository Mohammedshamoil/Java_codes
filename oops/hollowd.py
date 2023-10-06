# a=int(input("enter a number"))
# number=65
# for i in range(1,a+1):
#     ls=" "+(a-i)
#     word=" "
#     for j in range(1,i+1):
#         if j==1 or j==i:
#             word=word+str(number)+" "
#             number=number+1
#         else:
#             word=word+" "
#     print(ls+word)























a=int(input("enter a number"))
number=65
for i in range(1,a+1):
    ls=" "*(a-i)
    word=""
    for j in range(1,i+1):
        if j==1 or j==i:
            word=word+chr(number)+" "
            number=number+1
        else:
            word=word+"  "
    print(ls+word)
    
number=number-3
for i in range(1,a):
    ls=" "*i
    word=""
    for j in range(a-i):
        if j==0 or j==a-i-1:
            word=word+" "+chr(number)
            number=number-1
        else:
            word =word+"  "
            
    print(ls+word[::-1])