import tree.TreeNode;

import javax.xml.soap.Node;

/**
 * Created by ws03 on 2016/6/19.
 */
public class KthNode {
    int index = 0;

    TreeNode kthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0) {
            return null;
        }
        return getTarget(pRoot, k);
    }

    TreeNode target = null;
    TreeNode getTarget(TreeNode treeNode, int k) {
        if (treeNode.left != null) {
            target = getTarget(treeNode.left, k);
        }
        index++;
        if (index == k) {
            target = treeNode;
        }
        if (treeNode.right != null) {
            target = getTarget(treeNode.right, k);
        }
        return target;
    }
}
