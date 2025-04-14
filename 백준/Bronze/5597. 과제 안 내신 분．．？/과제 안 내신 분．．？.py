n = [int(i+1) for i in range(30)]

for i in range(28):
    x = int(input())
    if x in n:
        n.remove(x)

n.sort()

for j in n:
    print(j)
