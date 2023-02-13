package coding.test.preparation.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 자연수 n이 입력되면 n!를 구하는 프로그램을 작성하라
public class 팩토리얼 {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }

        return n * solution(n - 1);
    }

    @Test
    void result() {
        assertThat(solution(5)).isEqualTo(120);
    }
}
