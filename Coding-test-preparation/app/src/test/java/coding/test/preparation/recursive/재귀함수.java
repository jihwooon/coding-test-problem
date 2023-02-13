package coding.test.preparation.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 재귀함수를 이용하여 1 ~ n까지 출력하는 프로그램을 작성하라
public class 재귀함수 {
    public int solution(int n) {
        if (n == 0) return n;

        return solution(n - 1);
    }

    @Test
    void result() {
        assertThat(solution(3)).isEqualTo(0);
    }
}
