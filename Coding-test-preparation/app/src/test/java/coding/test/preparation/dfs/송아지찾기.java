package coding.test.preparation.dfs;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

public class 송아지찾기 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] arr;
    Queue<Integer> queue = new LinkedList<>();

    public int bfs(int s, int e) {
        arr = new int[10001];
        arr[s] = 1;
        queue.offer(s);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx < 10000 && arr[nx] == 0) {
                        arr[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(bfs(5, 14)).isEqualTo(3);
    }
}
