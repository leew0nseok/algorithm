def solution(sizes):
    x = []
    y = []
    for size in sizes: 
        if size[0] > size[1]:
            x.append(size[0])
            y.append(size[1])
        else:
            x.append(size[1])
            y.append(size[0])
    
    answer = max(x) * max(y)
    return answer