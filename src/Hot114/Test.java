package Hot114;

public class Test {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);


        a.left = b;
        a.right = e;

        b.left = c;
        b.right = d;

        e.right = f;

        Solution solution = new Solution();
        solution.flatten(a);


    }
}
