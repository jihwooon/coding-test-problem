package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * ## 미지의 것
 * 학생들의 번호를 나타내는 정수 배열이 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 나타내라
 * <p>
 * ## 자료
 * - 학생 3명의 정수 번호
 * -
 * <p>
 * ## 조건
 * -
 *
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */
public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i+1; j < number.length - 1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{-2, 3, 0, 2, -5})).isEqualTo(2);
        assertThat(solution(new int[]{-3, -2, -1, 0, 1, 2, 3})).isEqualTo(5);
        assertThat(solution(new int[]{-1, 1, -1, 1})).isEqualTo(0);
    }
}
