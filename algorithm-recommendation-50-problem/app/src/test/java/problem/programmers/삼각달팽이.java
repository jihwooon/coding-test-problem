package problem.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 1. 문제에 대한 이해
 * 우리가 풀어야 할 문제는 무엇인가?
 * - 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성
 * 주어진 자료는 무엇인가?
 * - 밑변의 길이와 높이가 n
 * >> 길이가
 * - 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기
 * >> 반시계: 꼭대기에 왼쪽부터 오른쪽으로 방향
 * 조건은 무엇인가?
 * -
 * 우리가 문제를 풀기 위해 주어진 자료가 충분한가?
 * 숨겨진 조건이나 자료가 있는가? 그렇다면 그 것을 다른 방법으로 해석해보라.
 * 2. 계획
 * 전에 비슷한 문제를 알고 있는가?
 * >>
 * 이 문제를 푸는데 있어서 유용하게 쓸 수 있는 지식은 무엇인가?
 * >>
 * 비슷한 문제를 풀어본 적이 있다면 그 것을 활용할 수 있는가?
 * >>
 * 만약 문제를 풀 수 없다면 문제를 더 단순하게 하기 위해서 주어진 조건을 버려보아라
 * >>
 * 주어진 자료로부터 유용한 것을 이끌어 낼 수 있는가?
 * >>
 * 자료는 모두 사용했는가?
 * 조건을 모두 사용했는가?
 * 문제에 포함된 핵심적인 개념은 모두 고려했는가?
 * 3. 실행
 * 풀이 계획을 실행하고, 각 단계가 올바른지 점검하라.
 * <p>
 * 4. 반성
 * 문제를 다른 방식으로 해결할 수 있는가?
 *  >> 단순 무식하게 문제를 풀면 왼쪽에서 오른쪽으로 훓으면서 배열에 담으면 이 문제를 풀 수 있다.
 *  그렇지만 구현 단계에서 어떻게 풀어야 할 지 고민이 되서 문제를 못 풀었다.
 *
 */

public class 삼각달팽이 {
    public int[] solution(int n) {
        int[] answer = new int[(n * (n + 1)) / 2];
        int[][] triangle = new int[n][n];

        int x = -1;
        int y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                }
                if (i % 3 == 1) {
                    y++;
                }
                if (i % 3 == 2) {
                    x--;
                    y--;
                }
            }
            triangle[x][y] = num++;
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (triangle[i][j] == 0) {
                    break;
                }
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(1)).isEqualTo(new int[]{1});
        assertThat(solution(4)).isEqualTo(new int[]{1,2,9,3,10,8,4,5,6,7});
    }
}
