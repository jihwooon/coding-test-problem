package coding.test.preparation.dfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tree_DFS {
    Node root;

    public int dfs(int n, Node root) {
        if (root.left == null && root.right == null) {
            return n;
        }

        return Math.min(dfs(n + 1, root.left), dfs(n + 1, root.right));
    }

    @Test
    public void result() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        assertThat(dfs(0, root)).isEqualTo(1);
    }
}
