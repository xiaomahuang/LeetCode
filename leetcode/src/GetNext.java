import jdk.nashorn.internal.ir.IfNode;
import tree.TreeLinkNode;

/**
 * Created by ws03 on 2016/6/19.
 */
public class GetNext {
    public TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }

        if (pNode.right == null) {
            TreeLinkNode fatherTreeLinkNode = pNode;
            if (fatherTreeLinkNode.next == null) {
                return null;
            }
            while (fatherTreeLinkNode.next.left != fatherTreeLinkNode) {
                fatherTreeLinkNode = fatherTreeLinkNode.next;
                if (fatherTreeLinkNode.next == null) {
                    return null;
                }
            }
            return fatherTreeLinkNode.next;
        } else {
            TreeLinkNode treeLinkNode = pNode.right;
            while (treeLinkNode.left != null) {
                treeLinkNode = treeLinkNode.left;
            }
            return treeLinkNode;
        }
    }
}
