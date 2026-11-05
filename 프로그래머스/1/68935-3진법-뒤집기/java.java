class Solution {
public int solution(int n){
        int answer = 0;
        String ans = "";
        int m=n;

        while(m!=0){
            ans += (m%3);
            m /= 3;
        }
        int pow = 1; // 거듭제곱용
        for(int i=ans.length()-1;i>=0;i--){
            int digit = ans.charAt(i)-'0';
            answer += digit*pow;
            pow *=3;
        }
        return answer;
    }
}