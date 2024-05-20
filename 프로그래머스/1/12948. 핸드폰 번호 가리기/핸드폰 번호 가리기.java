class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        int num_len = phone_number.length();
        
        for(int i =0; i < num_len; i++){
            if(i < num_len -4) {
                sb.append('*');
            }
            else{
                sb.append(phone_number.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}