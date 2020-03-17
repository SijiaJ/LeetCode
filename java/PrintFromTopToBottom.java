package dayN;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 **/
//利用队列性质，LinkedList实现了Deque接口，队列操作，deque.size()/deque.isEmpty()
    //offer向队列添加元素，poll删除并返回队首元素
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)return list;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (deque.size()>0){//(!deque.isEmpty())
//            TreeNode temp=deque.poll();//删除并返回队头元素
//            list.add(temp.val);
//            if(temp.left!=null)deque.offer(temp.left);
//            if(temp.right!=null)deque.offer(temp.right);
            list.add(deque.peek().val);
            if(deque.peek().left!=null)deque.offer(deque.peek().left);
            if(deque.peek().right!=null)deque.offer(deque.peek().right);
            deque.poll();
        }
        return list;
    }


    public static void main(String[] args) {
        PrintFromTopToBottom p = new PrintFromTopToBottom();
        TreeNode T =new TreeNode(8);
        TreeNode t = new TreeNode(T);
        System.out.println(p.PrintFromTopToBottom(T));

    }
}
