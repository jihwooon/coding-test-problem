package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long result = Long.parseLong(t.substring(i, p.length() + i));
            if (result <= number) answer++;

        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution("3141592", "271")).isEqualTo(2);
    }
}
