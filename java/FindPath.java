package dayN;
/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 **/
//利用栈存放节点（退到上一节点注意要把当前节点退栈）对栈的遍历for(Integer e:stack){sout(e);}
//result.add(new ArrayList(list));修改list集合不影响之前的引用
import java.util.ArrayList;
import java.util.Stack;

public class FindPath {
    ArrayList<ArrayList<Integer>> result =new ArrayList<>();
    public int length=0;
    //ArrayList<Integer> list =new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        Stack<Integer> stack = new Stack<>();
        if(root==null)return result;
        int curSum=0;
        FindPathCore(root,target,curSum,stack);
        return result;
    }
    public ArrayList<ArrayList<Integer>> FindPathCore(TreeNode root, int target, int curSum, Stack<Integer> stack) {
        //判断是否到达叶节点
        boolean isLeaf = root.left==null&&root.right==null;
        stack.push(root.val);
        curSum+=root.val;
        if(curSum==target&&isLeaf){
            ArrayList<Integer> list =new ArrayList<>();
            for(Integer e:stack){
                list.add(e);
            }
            System.out.println(length);
            System.out.println(list.size());
            if(length<list.size()){
                length = list.size();
                result.add(0,list);
            }
            else result.add(list);

        }
        //System.out.println(result);
        if(root.left!=null)
            FindPathCore(root.left,target,curSum,stack);
        if(root.right!=null)
            FindPathCore(root.right,target,curSum,stack);
        stack.pop();

        return result;
    }

    public static void main(String[] args) {
        FindPath f = new FindPath();
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        TreeNode T =new TreeNode(10);
        TreeNode t = new TreeNode(T);
        System.out.println(f.FindPath(T,22));

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        res.add(list);
        System.out.println(res);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(res);
        System.out.println(list);






    }
}
