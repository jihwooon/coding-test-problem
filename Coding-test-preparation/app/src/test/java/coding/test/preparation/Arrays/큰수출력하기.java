package coding.test.preparation.Arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * >> N개의 정수를 입력 받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 구하라.
 *
 * ## 계획
 * 1. 새로운 배열을 만든다.
 * 2. arr[0]의 자리를 미리 채운다.
 * 3. 반복문을 사용해서 ArrayList를 채운다.
 * 4. 조건은 선택 된 자리가 앞자리보다 크면 새로운 배열에 채운다.
 * 5. 앞 수보다 큰 수만을 출력한다.
 * ## 반성
 * arrList에 arr[0]을 미리 채우는 것을 몰랐다. 이번 기회에 이 방법이 있다는 것을 알게되었다.
 */
public class 큰수출력하기 {
    public List<Integer> solution(int n, int ... arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // arr[0]을 미리 채운다.
        for(int i = 1; i < n; i++) { // arr[1] ~ arr[6]
            if (arr[i] > arr[i - 1]) { //arr[1] > arr[0]
                answer.add(arr[i]); // arr[1] 추가한다.
            }
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(6, 7,3,9,5,6,12)).isEqualTo(Arrays.asList(7,9,6,12));
    }
}
