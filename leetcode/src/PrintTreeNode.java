import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ws03 on 2016/6/19.
 */
public class PrintTreeNode {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null)
                    queue.offer(treeNode.left);
                if (treeNode.right != null)
                    queue.offer(treeNode.right);
                list.add(treeNode.val);
            }
            lists.add(list);
        }
        return lists;
    }

    public ArrayList<ArrayList<Integer>> PrintZ(TreeNode pRoot) {
        int flag = 1;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while (!stack1.isEmpty()||!stack2.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            if (flag == 1) {
                int count = stack1.size();
                for (int i = 0; i < count; i++) {
                    TreeNode treeNode = stack1.pop();
                    if (treeNode.left != null)
                        stack2.push(treeNode.left);
                    if (treeNode.right != null)
                        stack2.push(treeNode.right);
                    list.add(treeNode.val);
                }
                flag=2;
            } else {
                int count = stack2.size();
                for (int i = 0; i < count; i++) {
                    TreeNode treeNode = stack2.pop();
                    if (treeNode.right != null)
                        stack1.push(treeNode.right);
                    if (treeNode.left != null)
                        stack1.push(treeNode.left);
                    list.add(treeNode.val);
                }
                flag=1;
            }
            lists.add(list);
        }
        return lists;
    }
}
