package problem.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 두 정수 x, y가 주어졌을 때, x, y의 짝꿍을 return을 하는 함수를 구하라
// 가장 큰 정수를 두 수의 짝꿍이라고 합니다.
// 두 수의 공통 된 수 중 가장 큰 정수를 구하라
// 100, 2345 = -1
// 10, 203045 = 0
// 100, 123450 = 10

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer();
        int[] x = new int[X.length()];
        int[] y = new int[Y.length()];

        for (int i = 0; i < X.length(); i++) {
            System.out.println(x[X.charAt(i) - 48] += 1);
        }

        for (int i = 0; i < Y.length(); i++) {
            System.out.println(y[Y.charAt(i) - 48] += 1);
        }


        return answer.toString();
    }

    @Test
    void result() {
        assertThat(solution("100", "2345")).isEqualTo("-1");
    }
}
