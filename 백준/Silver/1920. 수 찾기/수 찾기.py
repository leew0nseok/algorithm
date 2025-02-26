import sys

n = int(sys.stdin.readline())
n_arr = set(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
m_arr = list(map(int, sys.stdin.readline().split()))

for num in m_arr:
    if num in n_arr:
        print(1)
    else:
        print(0)