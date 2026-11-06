class Solution {
    public String solution(String s) {
        String answer = "";
        int pos = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                pos = 0;
                answer+=" ";
                continue;
            }else if(pos%2==0) answer+=s.toUpperCase().charAt(i);
            else answer+=s.toLowerCase().charAt(i);
            pos++;
        }
        return answer;
    }
}