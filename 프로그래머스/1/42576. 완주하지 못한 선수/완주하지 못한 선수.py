def solution(participant, completion):
    answer = ''
    result = {}
    for parti in participant:
        result[parti] = 0
    
    for co in completion:
        result[co] += 1
        
    for parti in participant:
        if result[parti] > 0:
            result[parti] -= 1
        else:
            answer = parti
    return answer