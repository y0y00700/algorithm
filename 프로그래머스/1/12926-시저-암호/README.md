# 12926. 시저 암호

- 문제: [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- 난이도: Lv. 1
- 제출 언어: java
- 제출 일자: 2026-11-12
- 채점 결과: × 정답입니다! 다른 사람의 풀이 보기 문제 의견 남기기

## 문제 설명

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

## 제한사항

제한사항을 페이지에서 읽지 못했습니다.

## 입출력 예시

| s | n | result
 | "AB" | 1 | "BC"
 | "z" | 1 | "a"
 | "a B z" | 4 | "e F d"

8개의 제출
새로고침

제출일시
언어
채점 내역

2026-11-12 20:17:29
Java

오답
7.7 / 100

2026-11-12 20:12:59
Java

정답
100 / 100

2026-11-12 20:02:44
Java

오답
7.7 / 100

2026-11-12 19:58:35
Java

오답
0 / 100

2026-11-12 19:33:10
Java

오답
7.7 / 100

2026-11-12 19:30:27
Java

오답
7.7 / 100

2026-11-12 19:29:42
Java

오답
7.7 / 100

2026-11-12 19:24:00
Java

오답
7.7 / 100
1

-
        Solution.java class Solution {
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

xxxxxxxxxx

3

12

1classSolution {

2publicStringsolution(Strings, intn) {

3Stringanswer="";

4for(inti=0; i<s.length(); i++ ) {

5intnum=Integer.valueOf(s.charAt(i));

6if(num>=65&&num<=90) {

7num+=n;

8if (num>90) {

9num-=26;

10                }

11answer+= (char)num;

12            } elseif (num>=97&&num<=122) {

13num+=n;

14if (num>122) {

15num-=26;

16                }

17answer+= (char)num;

18            } elseif(num==32) {

19answer+=" ";

20            }

21        }

22returnanswer;

23    }

24}

              실행 결과
                실행 중지

채점을 시작합니다.
정확성  테스트
 | 테스트 1 〉 | 통과 (3.18ms, 82.1MB)
 | 테스트 2 〉 | 통과 (7.37ms, 64.2MB)
 | 테스트 3 〉 | 통과 (2.49ms, 74.7MB)
 | 테스트 4 〉 | 통과 (4.47ms, 67.4MB)
 | 테스트 5 〉 | 통과 (2.82ms, 66.2MB)
 | 테스트 6 〉 | 통과 (2.51ms, 66.5MB)
 | 테스트 7 〉 | 통과 (2.74ms, 76.1MB)
 | 테스트 8 〉 | 통과 (2.47ms, 77.3MB)
 | 테스트 9 〉 | 통과 (3.76ms, 77.4MB)
 | 테스트 10 〉 | 통과 (3.46ms, 80.9MB)
 | 테스트 11 〉 | 통과 (3.60ms, 76MB)
 | 테스트 12 〉 | 통과 (3.32ms, 78.3MB)
 | 테스트 13 〉 | 통과 (12.32ms, 97.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

질문하기 (103)
          테스트 케이스 추가하기

다른 사람의 풀이초기화
코드 실행
제출 후 채점하기

×

## 풀이 파일

- [java](java.java)
