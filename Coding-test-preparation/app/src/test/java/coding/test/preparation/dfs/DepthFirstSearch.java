package coding.test.preparation.dfs;

public class DepthFirstSearch {
    Node root;

    public void DFS(Node root) {
        if(root == null) return;
        else {
            DFS(root.left);
            System.out.println(root.data + " ");
            DFS(root.right);
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.DFS(tree.root);
    }
}

