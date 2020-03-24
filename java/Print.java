package dayN;
/**
 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 **/
import java.util.ArrayList;
import java.util.LinkedList;

public class Print {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>>res = new ArrayList<>();
        if(pRoot==null)return res;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(pRoot);
        while (!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer>list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode t = q.poll();
                if(t==null)continue;
                list.add(t.val);
                q.offer(t.left);
                q.offer(t.right);
            }
            if(!list.isEmpty())
                res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        Print p = new Print();
        TreeNode T =new TreeNode(10);
        TreeNode t1 = new TreeNode(T);
        System.out.println(p.Print(T));
    }
}
