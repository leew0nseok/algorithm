import sys

n = int(sys.stdin.readline())
n_arr = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
m_arr = list(map(int, sys.stdin.readline().split()))

n_arr.sort()

for num in m_arr:
    le, rt = 0, n-1
    isFind = False

    while le <= rt:
        mid = (le + rt) // 2

        if num == n_arr[mid]:
            isFind = True
            break
        elif num < n_arr[mid]:
            rt = mid - 1
        elif num > n_arr[mid]:
            le = mid + 1

    if isFind:
        print(1)
    else:
        print(0)