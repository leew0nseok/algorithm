def solution(dirs):

    x, y, answer, history = 0, 0, 0, set()
    d2xy = {
        'U': (0, 1),	
        'D': (0, -1),	
        'L': (-1, 0),
        'R': (1, 0),	
    }
    
    for d in dirs:
        dx, dy = d2xy[d]
        if -5 <= x+dx <= 5 and -5 <= y+dy <= 5:
            if (x, y, x+dx, y+dy) not in history and (x+dx, y+dy, x, y) not in history:
                history.add((x, y, x+dx, y+dy))
                history.add((x+dx, y+dy, x, y))
                answer += 1
            x += dx
            y += dy
        
    return answer