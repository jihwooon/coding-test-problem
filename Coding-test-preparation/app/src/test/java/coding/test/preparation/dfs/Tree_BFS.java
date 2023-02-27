package coding.test.preparation.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_BFS {
    Node root;
    public int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>(); // 큐를 생성한다.
        queue.offer(root); // 시작 정점을 큐에 넣는다.

        int level = 0;
        while(!queue.isEmpty()) {
            for(int i = 0; i < queue.size(); i++) {
                Node current = queue.poll(); // 큐에서 정점을 하나 꺼낸다.
                if(current.left == null && current.right == null) return level;
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Tree_BFS tree = new Tree_BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.bfs(tree.root));
    }
}
