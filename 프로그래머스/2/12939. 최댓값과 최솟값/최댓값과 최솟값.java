import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringList = s.split(" ");
        
        int[] intArray = Arrays.stream(stringList)
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        int max = Arrays.stream(intArray).max().getAsInt();
        int min = Arrays.stream(intArray).min().getAsInt();
        
        answer = min + " " + max;
        return answer;
    }
}