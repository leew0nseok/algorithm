import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            answer.add((long) x * i);
        }
        
        long[] result = new long[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}