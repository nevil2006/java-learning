n=int(input())

original=n
rev=0

while n>0:
    digit=n%10
    rev=rev*10+digit
    n//=10
if original ==  rev:
    print("it is plaindrome")
else:
    print("it is not plaindrome")
