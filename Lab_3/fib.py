Fibdict = {'0':0, '1':1, '2':1}
def Fibonacci(n):
    if str(n) in Fibdict.keys():
        # print(f"fib {n} = {Fibdict[str(n)]}")
        return Fibdict[str(n)]
    else:
        print(Fibonacci(n-1), Fibonacci(n-2))
        Fibdict[str(n)] = Fibonacci(n-1)+Fibonacci(n-2)
        return Fibdict[str(n)]
def Primes(n):
    primes = [2,3]
    i = 3
    while len(primes)<n:
        a = [(i%j)==0 for j in primes]
        # for j in primes:
        #     if i%j==0:
        #         i+=1
        #         break
        # print(a)
        if sum(a)>0:
            i+=1
            pass
        else:
            primes.append(i)
            i+=1
    return primes
if __name__=='__main__':
    finished = False
    while not finished:
        number = input("What fib number would you like? (Type 'end' to end)")
        if number == "end":
            break
        else:
            number = int(number)
        print("The {0}th Fib number is {1}.".format(number, Fibonacci(number)))
    nprime = int(input("How many primes would you like to eat? "))
    print(Primes(nprime))