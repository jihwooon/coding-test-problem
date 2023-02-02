package interview.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * - 정수값이 주어졌을 때, 그 숫자를 뒤집어서 출력하는 프로그램을 작성하라
 *
 * ## 자료
 * - 정수값 (= 음수값이 아님)
 *
 * ## 조건
 * -
 *
 * ## 계획
 * - x를 입력한다.
 * - x의 값이 음수가 아닌 정수값으로만 출력이 되야 한다.
 * - x값을 뒤집어야 한다.
 * - 변경 된 값을 출력한다.
 *
 * ## 반성
 * - 숫자 뒤집기의 문제 접근법을 잘 몰랐다. 42 숫자를 24로 변경한다. 이 접근방법이 떠오르지 않았다.
 * 해설지를 보고 이해가 갓다.
 *
 */
public class 숫자뒤집기 {

    public long solution(int x) {
        long result = 0;
        long xRemaining = Math.abs(x); // 절대값
        while (xRemaining != 0) {
            result = result * 10 + xRemaining % 10;
            System.out.println("xRemaining = " + xRemaining);
            xRemaining /= 10;

        }
        return x < 0 ? -result : result;
    }

    @Test
    void result() {
        assertThat(solution(42)).isEqualTo(24);
    }
}
