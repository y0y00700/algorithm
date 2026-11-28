import java.util.HashSet;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashSet <Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                // main
                int pos = i-1, idx=0;
                while(pos>=0){
                    idx++;
                    if(s.charAt(pos)==s.charAt(i)) break;
                    pos--;
                }
                answer[i] = idx;
            }else{
                // add
                hs.add(s.charAt(i));
                answer[i] = -1;
            }
        }
        return answer;
    }
}