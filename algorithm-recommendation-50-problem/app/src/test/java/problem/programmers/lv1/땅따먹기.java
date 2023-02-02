package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 최대값 구하기

// 각 열의 최대값을 뽑아서 합을 구한다.
// 위 아래 같은 행은 아니다.
// dfs
public class 땅따먹기 {
    int solution(int[][] land) {
        int sum = 0;
        for(int i = 1 ; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }
        for(int j = 0; j < 4; j++) {
            sum = Math.max(sum, land[land.length - 1][j]);
        }

        return sum;
    }


    @Test
    void result() {
        assertThat(solution(new int[][]{
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1},
        })).isEqualTo(16);

    }
}
