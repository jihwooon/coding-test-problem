package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 준호가 몇 라운드까지 막을 수 있는지 return 하도록 solution 함수를 구하시오
 * <p>
 * ## 자료
 * - 병사의 수 n
 * - 무적권 k
 * - 병사 중 막을 수 있는 라운드
 *
 * <p>
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * - 현재 병사 수와 첫라운드의 수를 뺀다.
 * - 뺀수를 다음 라운드수를 뺀다.
 * - 현재 수가 다음 라운드 수보다 작으면 리턴한다.
 * - 만약 k를 사용하면 현재 라운드에서 다음 라운드로 넘어간다.
 * <p>
 * ## 반성
 * -
 * -
 */
public class 디펜스게임 {
    public int solution(int n, int k, int[] enemy) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < enemy.length; i++) {
            queue.add(enemy[i]);

            if(queue.size() > k) {
                n -= queue.poll();
            }

            if(n < 0) {
                return i;
            }

        }
        return enemy.length;
    }

    @Test
    void result() {
        assertThat(solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1})).isEqualTo(5);
    }
}
