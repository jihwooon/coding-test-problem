package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
 * k 개수 중 가장 최하의 수 구하기
 * ## 자료
 * 점수의 개수 k
 * 출연한 가수들의 점수 score
 * 일차는 점수score의 길이
 * <p>
 * ## 조건
 * ## 계획
 * - 배열이 첫번째 자리부터 마지막 자리까지 for문을 이용한다.
 * -
 * -
 * - 명예의 전당의 최소값을 반환한다.
 * ## 반성
 */
public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> sc = new ArrayList();
        for (int i = 0; i < score.length; i++) {
            if(i < k-1) {
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder()); // score를 오름차순으로 정렬한다
                answer[i] = sc.get(sc.size() - 1); // 맨 앞의 최소값을 넣는다.
            } else if(i >= k-1) {
                sc.add(score[i]); // score를 배열에 추가한다
                sc.sort(Collections.reverseOrder()); // score를 오름차순으로 정렬한다
                answer[i] = sc.get(k-1);
            }
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})).isEqualTo(new int[]{10, 10, 10, 20, 20, 100, 100});
    }
}
