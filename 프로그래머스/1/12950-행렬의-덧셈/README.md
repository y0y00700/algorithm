# 12950. 행렬의 덧셈

- 문제: [행렬의 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/12950)
- 난이도: Lv. 1
- 제출 언어: java
- 제출 일자: 2026-11-03
- 채점 결과: × 정답입니다! 점수를 획득하였습니다! 1003 (+2) 다른 사람의 풀이 보기 문제 의견 남기기

## 문제 설명

행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

## 제한사항

제한사항을 페이지에서 읽지 못했습니다.

## 입출력 예시

| arr1 | arr2 | return
 | [[1,2],[2,3]] | [[3,4],[5,6]] | [[4,6],[7,9]]
 | [[1],[2]] | [[3],[4]] | [[4],[6]]

0개의 제출
새로고침

제출 내역이 없습니다

-
        Solution.java class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
               answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

​x

1classSolution {

2publicint[][] solution(int[][] arr1, int[][] arr2) {

3int[][] answer=newint [arr1.length][arr1[0].length];

4for(inti=0;i<arr1.length;i++){

5for(intj=0;j<arr1[0].length;j++){

6answer[i][j] =arr1[i][j] +arr2[i][j];

7            }

8        }

9returnanswer;

10    }

11}

              실행 결과
                실행 중지

같은 코드로 채점한 결과가 있습니다.
정확성  테스트
 | 테스트 1 〉 | 통과 (0.01ms, 75.6MB)
 | 테스트 2 〉 | 통과 (0.03ms, 66.8MB)
 | 테스트 3 〉 | 통과 (0.07ms, 66.8MB)
 | 테스트 4 〉 | 통과 (0.03ms, 67.5MB)
 | 테스트 5 〉 | 통과 (0.03ms, 80.8MB)
 | 테스트 6 〉 | 통과 (0.04ms, 80.3MB)
 | 테스트 7 〉 | 통과 (0.01ms, 65.8MB)
 | 테스트 8 〉 | 통과 (0.02ms, 74.3MB)
 | 테스트 9 〉 | 통과 (0.27ms, 71.1MB)
 | 테스트 10 〉 | 통과 (0.17ms, 65.9MB)
 | 테스트 11 〉 | 통과 (0.10ms, 67.2MB)
 | 테스트 12 〉 | 통과 (0.15ms, 67.8MB)
 | 테스트 13 〉 | 통과 (0.10ms, 67.1MB)
 | 테스트 14 〉 | 통과 (0.15ms, 66.4MB)
 | 테스트 15 〉 | 통과 (0.17ms, 76.7MB)
 | 테스트 16 〉 | 통과 (0.16ms, 68MB)
 | 테스트 17 〉 | 통과 (2.44ms, 121MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

질문하기 (36)
          테스트 케이스 추가하기

다른 사람의 풀이초기화
코드 실행
제출 후 채점하기

×

## 풀이 파일

- [java](java.java)
