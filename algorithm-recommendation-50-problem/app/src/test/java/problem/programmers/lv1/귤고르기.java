package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * ## 미지의 것
 * 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 *
 * ## 자료
 * - 귤의 개수 K
 * - 귤의 크기를 담은 배열 tangerine
 * - 다른 종류의 수의 최솟값
 *
 * ## 조건
 * - 크기 별로 서로 다른 종류의 수를 최소화 한다.
 * - 배열의 크기에
 *
 * ## 계획
 * - 귤의 크기의 배열의 서로 다른 수를 나눈다.
 *  >> 1,1,1,3,3, = [111], [33]
 * -
 * -
 *
 * ## 반성
 *
 */
public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0; // 서로 다른 종류의 수의 최솟값

        for (int x: tangerine) {

        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(3);
    }
}
