/**
 * Created by majun on 2016/6/27.
 */
public class ReConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length || pre.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        contructTreeNode(pre, 0, pre.length - 1, in, 0, in.length - 1, root);
        return root;
    }

    public void contructTreeNode(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd, TreeNode treeNode) {
        int index = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (pre[preStart] == in[i]) {
                index = i;
            }
        }
        if (inStart < index) {
            treeNode.left=new TreeNode(pre[preStart+1]);
            contructTreeNode(pre, preStart + 1, preStart + index - inStart, in, inStart, index - 1, treeNode.left);
        }
        if (index < inEnd) {
            treeNode.right=new TreeNode(pre[preStart + 1 + index - inStart]);
            contructTreeNode(pre, preStart + 1 + index - inStart, preEnd, in, index + 1, inEnd, treeNode.right);
        }
    }
}
