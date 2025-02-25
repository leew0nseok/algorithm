import sys

n = int(sys.stdin.readline())

queue = []

for i in range(n):
    x = sys.stdin.readline().split()
    if x[0] == 'push': 
        queue.append(int(x[1]))
    elif x[0] == 'pop':
        if len(queue) == 0: print(-1)
        else: print(queue.pop(0))
    elif x[0] == 'size': print(len(queue))
    elif x[0] == 'empty': 
        if len(queue) == 0: print(1)
        else: print(0)
    elif x[0] == 'front': 
        if len(queue) == 0: print(-1)
        else: print(queue[0])
    elif x[0] == 'back': 
        if len(queue) == 0: print(-1)
        else: print(queue[-1])