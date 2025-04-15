var = str(input())

count = [0 for r in range(10)]

for num in var: 
    num = int(num)
    if num == 9:
        if count[6] < count[9]:
            count[6] += 1
        else:
            count[9] += 1
    elif num == 6:
        if count[6] < count[9]:
            count[6] += 1
        else:
            count[9] += 1
    else:
        count[num] += 1


print(max(count))
