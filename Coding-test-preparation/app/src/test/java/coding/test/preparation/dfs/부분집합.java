package coding.test.preparation.dfs;

public class 부분집합 {
    static int n;
    static int[] map;

    public void dfs(int L) {
        if (L == n + 1) {
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (map[i] == 1) {
                    temp += (i + " ");
                }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            map[L] = 1;
            dfs(L + 1); // 왼쪽 트리
            map[L] = 0;
            dfs(L + 1); // 오른쪽 트리
        }
    }

    public static void main(String[] args) {
        부분집합 root = new 부분집합();
        n = 3;
        map = new int[n + 1];
        root.dfs(1);
    }
}
