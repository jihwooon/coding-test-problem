package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 미지의 것
 * 상빈이가 받을 수 있는 콜라의 병 수
 * <p>
 * 자료
 * 빈병 a
 * 가져다 주는 병 b
 * 빈병 n
 * <p>
 * 빈 병20병을 주면 10개를 받는다.
 * 10병을 마신 후 주면 5병을 준다.
 * 5병 중 4병을 마신 후 주면 2병을 받는다.
 * 2병을 마신 후 주면 1병을 받는다.
 * 1병과 5병 때 남은 1병을 주면 1병을 받는다.
 * <p>
 * 20 + 10 + 5 + 2 + 1 + 1
 * <p>
 * 홀수 인 경우 -1 을 해서 다시 절반을 나눈다.
 * 짝수 인 경우 절반을 나눈다.
 * 총 합의 갯수를 구한다.
 */
public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (true) {
            if (n < a) {
                break;
            }

            answer += (n / a) * b;
            int remain = n % a;
            n = (n / a) * b + remain;
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(2, 1, 20)).isEqualTo(19);
    }
}
