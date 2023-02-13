package coding.test.preparation.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 피보나치 수열(=메모이제이션)을 출력한다.
public class 피보나치재귀 {
    public int solution(int n) {
        int[] fibo = new int[n + 1];
        if (n == 1) return fibo[n] = 1;
        if (n == 2) return fibo[n] = 1;

        return fibo[n] = solution(n - 2) + solution(n - 1);
    }

    @Test
    void result() {
        assertThat(solution(1)).isEqualTo(1);
        assertThat(solution(1)).isEqualTo(1);
        assertThat(solution(3)).isEqualTo(2);
        assertThat(solution(4)).isEqualTo(3);
        assertThat(solution(5)).isEqualTo(5);
        assertThat(solution(6)).isEqualTo(8);
        assertThat(solution(7)).isEqualTo(13);
    }
}
