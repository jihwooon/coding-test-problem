package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
 *
 * ## 자료
 * -
 *
 * ## 조건
 * - parameter는 영어 소문자로만 이루어져 있어야 합니다.
 *
 * ## 계획
 * -
 * -
 * -
 *
 * ## 반성
 * -
 * -
 */

public class 문자열나누기 {

    public int solution(String s) {
        String[] array = s.split(",");
        System.out.println(Arrays.toString(array));
        int length = array.length;
        if(length == 0) {
            return 0;
        }
        int answer = 0;
        int index = 0;

        for(index = 0; index < length; index++) {

        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution("banana")).isEqualTo(3);
//        assertThat(solution("ab ra ca da br a")).isEqualTo(6);
    }
}
