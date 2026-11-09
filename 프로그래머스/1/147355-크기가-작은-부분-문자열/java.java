class Solution {
    public int solution(String t, String p) {
        int answer = 0, parse = Integer.parseInt(p);

        for(int i=0;i<t.length()-p.length()+1;i++){
            int j = 0;
            String tmp= t.substring(i,i+p.length());
            if(Integer.parseInt(tmp) <= parse) answer++;
        }

        return answer;
    }
}