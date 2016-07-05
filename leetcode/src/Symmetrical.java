import tree.TreeNode;

/**
 * Created by ws03 on 2016/6/19.
 */
public class Symmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return getResult(pRoot.left, pRoot.right);
    }

    boolean getResult(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null)
            return true;
        if ((treeNode1 == null && treeNode2 != null) || (treeNode1 != null && treeNode2 == null) || (treeNode1.val != treeNode2.val))
            return false;
        return getResult(treeNode1.left, treeNode2.right) && getResult(treeNode1.right, treeNode2.left);
    }
}
