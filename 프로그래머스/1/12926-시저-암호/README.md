# 12926. 시저 암호

- 문제: [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- 난이도: Lv. 1
- 제출 언어: java
- 제출 일자: 2026-11-16
- 채점 결과: 테스트를 통과하였습니다.

## 문제 설명

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

## 제한사항

제한사항을 페이지에서 읽지 못했습니다.

## 입출력 예시

| s | n | result
 | "AB" | 1 | "BC"
 | "z" | 1 | "a"
 | "a B z" | 4 | "e F d"

13개의 제출
새로고침

제출일시
언어
채점 내역

2026-11-12 20:29:39
Java

오답
7.7 / 100

2026-11-12 20:28:14
Java

오답
7.7 / 100

2026-11-12 20:28:03
Java

오답
0 / 100

2026-11-12 20:27:32
Java

정답
100 / 100

2026-11-12 20:27:19
Java

오답
0 / 100

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
12

-
        Solution.java class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int c : s.toCharArray()){
            if(c == 32) answer+=(char)c;
            else if (c == 122 || c == 90) answer += (char)(c-26 + n);
            else answer += (char)(c+ n);
        }
        return answer;
    }
}

1classSolution {

2publicStringsolution(Strings, intn) {

3Stringanswer="";

4for(intc : s.toCharArray()){

5if(c==32) answer+=(char)c;

6elseif (c==122||c==90) answer+= (char)(c-26+n);

7elseanswer+= (char)(c+n);

8        }

9returnanswer;

10    }

11}

              실행 결과
                실행 중지

같은 코드로 채점한 결과가 있습니다.
정확성  테스트
 | 테스트 1 〉 | 실패 (2.26ms, 76.7MB)
 | 테스트 2 〉 | 실패 (2.37ms, 77.9MB)
 | 테스트 3 〉 | 실패 (2.78ms, 79.8MB)
 | 테스트 4 〉 | 실패 (3.53ms, 67MB)
 | 테스트 5 〉 | 실패 (2.55ms, 68.4MB)
 | 테스트 6 〉 | 실패 (3.95ms, 66.1MB)
 | 테스트 7 〉 | 실패 (2.46ms, 66.1MB)
 | 테스트 8 〉 | 실패 (2.28ms, 65.4MB)
 | 테스트 9 〉 | 통과 (4.67ms, 67.1MB)
 | 테스트 10 〉 | 실패 (4.79ms, 77.6MB)
 | 테스트 11 〉 | 실패 (2.27ms, 65.6MB)
 | 테스트 12 〉 | 실패 (2.64ms, 66MB)
 | 테스트 13 〉 | 실패 (12.31ms, 108MB)
채점 결과
정확성: 7.7
합계: 7.7 / 100.0

질문하기 (103)
          테스트 케이스 추가하기

다른 사람의 풀이초기화
코드 실행
제출 후 채점하기

×

## 풀이 파일

- [java](java.java)
