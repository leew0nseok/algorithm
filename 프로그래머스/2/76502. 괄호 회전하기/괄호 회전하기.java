public class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            StringBuilder stack = new StringBuilder();
            boolean cnt = true;

            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);
                if (c == ')' || c == '}' || c == ']') {
                    if (stack.length() == 0) {
                        cnt = false;
                        break;
                    }
                    char sc = stack.charAt(stack.length() - 1);
                    if ((c == ')' && sc != '(') ||
                        (c == '}' && sc != '{') ||
                        (c == ']' && sc != '[')) {
                        cnt = false;
                        break;
                    }
                    stack.deleteCharAt(stack.length() - 1);
                } else if (c == '(' || c == '{' || c == '[') {
                    stack.append(c);
                }
            }

            if (cnt && stack.length() == 0) {
                answer += 1;
            }

            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "[](){}";
        Solution sol = new Solution();
        int ans = sol.solution(str);
        System.out.println(ans);
    }
}
