import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String ans = "";
        String tmpStr = "";
        HashMap<String,Integer> ma = new HashMap<>();
        ma.put("zero",0);
        ma.put("one",1);
        ma.put("two",2);
        ma.put("three",3);
        ma.put("four",4);
        ma.put("five",5);
        ma.put("six",6);
        ma.put("seven",7);
        ma.put("eight",8);
        ma.put("nine",9);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57) ans += s.charAt(i);
            else{
                tmpStr+=s.charAt(i);
                if(ma.containsKey(tmpStr)) {
                    ans += ma.get(tmpStr);
                    tmpStr = "";
                }
            }
        }
        return answer = Integer.parseInt(ans);
    }
}