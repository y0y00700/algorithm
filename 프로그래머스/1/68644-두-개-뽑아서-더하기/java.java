import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer ;
        HashSet<Integer> s = new HashSet<>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            if(i!=0&&numbers[i]==numbers[i-1]) continue;
            for(int j=i+1;j<numbers.length;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        answer = s.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }
}