package Hot114;

public class Solution {


        private TreeNode p = null;
        public void flatten(TreeNode root) {
            conver(root);
        }

        public void conver(TreeNode root){
            if(root == null) return ;
            if(p == null){
                p = root;
            }else{
                p.right = root;
                p = root;
            }

            conver(root.left);
            conver(root.right);

        }
}
