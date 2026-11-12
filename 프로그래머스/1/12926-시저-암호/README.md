# 12926. 시저 암호

- 문제: [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
- 난이도: Lv. 1
- 제출 언어: java
- 제출 일자: 2026-11-12
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

0개의 제출
새로고침

제출 내역이 없습니다

-
        Solution.java class Solution {
    public String solution(String s, int n) {
        String answer = "";
        return answer;
    }
}

​x

1classSolution {

2publicStringsolution(Strings, intn) {

3Stringanswer="";

4for(longc : s.toCharArray()){

5if((c>=97&&c<=122)||(c>=65&&c<=90)) {

6if (c==122||c==90) answer+= (char)(c-26+n);

7elseanswer+= (char)(c+n);

8            }elseanswer+=(char)c;

9        }

10​

11returnanswer;

12    }

13}

              실행 결과
                실행 중지

 | 테스트 1
 | 입력값 〉 | "AB", 1
 | 기댓값 〉 | "BC"
 | 실행 결과 〉 | 테스트를 통과하였습니다.
 | 출력 〉 |
 | 테스트 2
 | 입력값 〉 | "z", 1
 | 기댓값 〉 | "a"
 | 실행 결과 〉 | 테스트를 통과하였습니다.
 | 출력 〉 |
 | 테스트 3
 | 입력값 〉 | "a B z", 4
 | 기댓값 〉 | "e F d"
 | 실행 결과 〉 | 테스트를 통과하였습니다.
 | 출력 〉 |
테스트 결과 (~˘▾˘)~
3개 중 3개 성공
샘플 테스트 케이스를 통과했다는 의미로, 작성한 코드가 문제의 정답은 아닐 수 있습니다.
(샘플 테스트 케이스는 [테스트 케이스 추가하기] 버튼을 통해 확인하실 수 있습니다.)

질문하기 (103)
          테스트 케이스 추가하기

다른 사람의 풀이초기화
코드 실행
제출 후 채점하기

×

## 풀이 파일

- [java](java.java)
