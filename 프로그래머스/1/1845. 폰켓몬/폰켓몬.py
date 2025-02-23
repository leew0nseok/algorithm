def solution(nums):
    answer = 0
    a = []
    val = len(nums)/2
    for i in range(len(nums)):
        if nums[i] not in a:
            a.append(nums[i])
            answer +=1
        if answer == val:
            break
    return answer