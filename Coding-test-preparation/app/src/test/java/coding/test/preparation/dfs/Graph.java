package coding.test.preparation.dfs;

import java.util.Scanner;

public class Graph {
    static int x = 0;
    static int y = 0;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == x) answer++;
        else {
            for (int i = 0; i <= x; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph tree = new Graph();
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        graph = new int[x + 1][y + 1];
        ch = new int[x + 1];
        for (int i = 0; i < y; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        tree.DFS(1);
        System.out.println(answer);
    }
}
