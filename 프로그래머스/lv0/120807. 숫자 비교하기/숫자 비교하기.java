import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2)    answer = 1;
        else    answer = -1;
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int answer = new Solution().solution(num1, num2);
        System.out.println(answer);
    }
}

