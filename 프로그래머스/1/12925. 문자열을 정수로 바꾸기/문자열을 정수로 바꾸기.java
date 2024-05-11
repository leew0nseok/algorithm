class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-'){
            answer = -1 * Integer.parseInt(s.substring(1));
        }
        else{
            answer = Integer.parseInt(s.substring(0));
        }
        return answer;
    }
}