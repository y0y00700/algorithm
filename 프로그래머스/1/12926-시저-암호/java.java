class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(long c : s.toCharArray()){
            if(c == 32) answer+=(char)c;
            else if (c == 122 || c == 90) answer += (char)(c-26 + n);
            else answer += (char)(c+ n);
        }
        return answer;
    }
}