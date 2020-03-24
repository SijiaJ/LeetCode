package dayN;
/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
 * 其他行以此类推。
 **/
import java.util.ArrayList;
import java.util.LinkedList;

public class PrintTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot==null)return res;
        boolean flag = true;//判断标志，元素加入list顺序
        q.offer(pRoot);
        while (!q.isEmpty()){
            int size =q.size();
            System.out.println(size);
            ArrayList<Integer>list=new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode t = q.poll();
                if(t==null)continue;//否则会报空指针异常
                if(flag){
                    list.add(t.val);
                }else {
                    list.add(0,t.val);
                }
                q.offer(t.left);
                q.offer(t.right);
            }
            if(list.size()!=0)
                res.add(list);
            flag=!flag;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintTree p =new PrintTree();
        TreeNode T =new TreeNode(10);
        TreeNode t1 = new TreeNode(T);
        System.out.println(p.Print(T));
    }
}
