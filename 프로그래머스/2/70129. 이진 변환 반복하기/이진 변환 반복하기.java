import java.util.Arrays;


public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int totalCount = 0;
        int zeroCount = 0;
        StringBuilder sb = new StringBuilder(s);

        while(sb.length() != 1) {
            for (int i = 0; i < sb.length();) {
                char c = sb.charAt(i);
                if (c == '0') {
                    zeroCount += 1;
                    sb.deleteCharAt(i);
                }else {
                    i ++;
                }
            }

            sb = new StringBuilder(Integer.toBinaryString(sb.length()));
            totalCount += 1;
        }
        answer[0] = totalCount;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args) {
        String str = "110010101001";
        Solution sol = new Solution();
        int[] ans = sol.solution(str);
        System.out.println(ans);
    }

}