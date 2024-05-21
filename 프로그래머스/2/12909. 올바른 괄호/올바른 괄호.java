import java.util.Arrays;


public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        StringBuilder stack = new StringBuilder();
        StringBuffer value = new StringBuffer(s);

        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            if (c == ')'){
                try {
                    stack.deleteCharAt(stack.length() - 1);
                }
                catch (Exception e){
                    return false;
                }
            }
            else if(stack.length() == 0 || c == '('){
                stack.append(c);
            }
        }
        
        if(stack.length() != 0){
            return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = ")()()";
        Solution sol = new Solution();
        boolean ans = sol.solution(str);
        System.out.println(ans);
    }
}