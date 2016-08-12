import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by majun on 16/8/6.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        StringBuilder string =new StringBuilder();
        getPath(root,list,string);
        return list;
    }

    public void getPath(TreeNode node,List<String> list,StringBuilder builder)
    {
        if(node==null) {
            list.add(builder.toString());
        }
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder string=new StringBuilder(builder.append("->").append(node.val).toString());
        if(node.left==null&&node.right!=null)
        {
            getPath(node.right,list,string);
        }else if(node.right==null&&node.left!=null)
        {
            getPath(node.left,list,string);
        }else if(node.right!=null&&node.left!=null)
        {
            getPath(node.right,list,string);
            getPath(node.left,list,string);
        }else
        {
            getPath(null,list,string);
        }
    }
}
