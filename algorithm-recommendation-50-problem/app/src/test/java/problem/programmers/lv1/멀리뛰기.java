package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class 멀리뛰기 {
    public long solution(int i) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int n = 3; n < 2001; n++) {
            dp[n] = (dp[n-2] + dp[n-1]) % 1234567;
        }
        return dp[i];
    }

    @Test
    void result() {
        assertThat(solution(4)).isEqualTo(5);
        assertThat(solution(3)).isEqualTo(3);
    }
}
