class Solution {
    public int[] solution(long n) {
        String str_n = Long.toString(n);
        int length = str_n.length();
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(str_n.charAt(length - 1 - i)));
        }
        
        return answer;
    }
}
