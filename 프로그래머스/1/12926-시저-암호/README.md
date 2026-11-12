# 12926. 시저 암호

- 문제: [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- 난이도: Lv. 1
- 제출 언어: java
- 제출 일자: 2026-11-12
- 채점 결과: × 정답입니다! 점수를 획득하였습니다! 1053 (+8) 다른 사람의 풀이 보기 문제 의견 남기기

## 문제 설명

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

## 제한사항

제한사항을 페이지에서 읽지 못했습니다.

## 입출력 예시

| s | n | result
 | "AB" | 1 | "BC"
 | "z" | 1 | "a"
 | "a B z" | 4 | "e F d"

6개의 제출
새로고침

제출일시
언어
채점 내역

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
        for(char c : s.toCharArray()){
            if(c == ' ') answer+=(char)c;
            else if (c == 'Z' || c == 'z') answer += (char)(c-26+n);
            else answer += (char)(c+n);
        }

        return answer;
    }
}

xxxxxxxxxx

1classSolution {

2publicStringsolution(Strings, intn) {

3Stringanswer="";

4for(intc : s.toCharArray()){

5if(c==32) answer+=" ";

6elseif (c==90||c==122) answer+= (char)(c-26+n);

7elseanswer+= (char)(c+n);

8        }

9​

10returnanswer;

11    }

12}

              실행 결과
                실행 중지

채점을 시작합니다.
정확성  테스트
 | 테스트 1 〉 |
 | 테스트 2 〉 |
 | 테스트 3 〉 | 실패 (2.47ms, 66.2MB)
 | 테스트 4 〉 | 실패 (2.23ms, 66MB)
 | 테스트 5 〉 |
 | 테스트 6 〉 |
 | 테스트 7 〉 |
 | 테스트 8 〉 |
 | 테스트 9 〉 |
 | 테스트 10 〉 |
 | 테스트 11 〉 |
 | 테스트 12 〉 |
 | 테스트 13 〉 |

질문하기 (103)
          테스트 케이스 추가하기

다른 사람의 풀이초기화
코드 실행
제출 후 채점하기

×

## 풀이 파일

- [java](java.java)
