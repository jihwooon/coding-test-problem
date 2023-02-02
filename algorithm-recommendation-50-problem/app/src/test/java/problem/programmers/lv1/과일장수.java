package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length - 1; i >= 0; i--) {
            if((score.length - i) % m == 0) answer += score[i] * m;
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(3,4, new int[]{1,2,3,1,2,3,1})).isEqualTo(8);
    }
}
