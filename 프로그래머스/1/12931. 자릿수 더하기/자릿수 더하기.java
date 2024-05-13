import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strnum = Integer.toString(n);
        
        for(int i = 0; i < strnum.length(); i++){
            answer += Integer.parseInt(String.valueOf(strnum.charAt(i)));
        }
        
        return answer;
    }
}