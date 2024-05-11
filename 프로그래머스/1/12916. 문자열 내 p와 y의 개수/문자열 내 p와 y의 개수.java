class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pvalue = 0;
        int yvalue = 0;
        
        
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'p'){
                pvalue += 1;
            }
            else if(s.charAt(i) == 'P'){
                pvalue += 1;
            }
            else if (s.charAt(i) == 'y'){
                yvalue +=1;
            }
            else if (s.charAt(i) == 'Y'){
                yvalue +=1;
            }
        }
        
        if (pvalue != yvalue){
            answer = false;
        }
        
        return answer;
    }
}