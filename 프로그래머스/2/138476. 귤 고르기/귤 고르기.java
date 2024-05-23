import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int num : tangerine) {
            if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        List<Integer> keyList = new ArrayList<>(numCount.keySet());
        keyList.sort(((o1, o2) -> numCount.get(o2) - numCount.get(o1)));

        for (Integer i : keyList) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= numCount.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 3, 2, 5, 4, 5, 2, 3};
        Solution sol = new Solution();
        int ans = sol.solution(6, intArray);
        System.out.println(ans);
    }
}
