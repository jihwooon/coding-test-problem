package interview.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//숫자 뒤집기

/**
 * 미지의 것은 무엇인가?
 * >> 정수값이 주어졌을 때, 그 숫자를 뒤집어서 출력하는 프로그램을 작성하라.
 * <p>
 * 자료는 무엇인가?
 * >> 정수값 (= 음수값은 아니여야한다.)
 */
public class Reverse {

    public long solution(int x) {
        long result = 0;
        long xRemaining = Math.abs(x);;
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
