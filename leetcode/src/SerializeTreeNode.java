import tree.TreeNode;

/**
 * Created by ws03 on 2016/6/19.
 */
public class SerializeTreeNode {
    String serialize(TreeNode root) {
        if (root == null)
            return "$";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    int index = -1;

    TreeNode deserialize(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strings = str.split(",");
        return getTreeNode(strings);
    }

    public TreeNode getTreeNode(String[] strings) {
        index++;
        if (index >= strings.length) {
            return null;
        }
        if (strings[index].equals("$")) {
            return null;
        }
        int i=Integer.parseInt(strings[index]);
        TreeNode treeNode = new TreeNode(i);
        treeNode.left = getTreeNode(strings);
        treeNode.right = getTreeNode(strings);
        return treeNode;
    }
}
