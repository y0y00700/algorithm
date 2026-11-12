class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(long c : s.toCharArray()){
            if((c>=97&&c<=122)||(c>=65&&c<=90)) {
                if (c == 122 || c == 90) answer += (char)(c-26 + n);
                else answer += (char)(c+ n);
            }else answer+=(char)c;
        }

        return answer;
    }
}