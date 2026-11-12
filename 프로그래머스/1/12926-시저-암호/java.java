class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int c : s.toCharArray()){
            if(c == 32) answer+=" ";
            else if (c == 90 || c == 122) answer += (char)(c-26+n);
            else answer += (char)(c+n);
        }

        return answer;
    }
}