package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * ## 자료
 * - 귤의 개수 K
 * - 귤의 크기를 담은 배열 tangerine
 * - 다른 종류의 수의 최솟값
 * <p>
 * ## 조건
 * - 크기 별로 서로 다른 종류의 수를 최소화 한다.
 * - 배열의 크기에
 * <p>
 * ## 계획
 * - 귤의 크기의 배열의 서로 다른 수를 나눈다.
 * >> 1,1,1,3,3, = [111], [33]
 * -
 * -
 * <p>
 * ## 반성
 */
public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();

    }

    @Test
    void result() {
        assertThat(solution(new int[]{7, 9, 1, 1, 4})).isEqualTo(18);
    }
}
