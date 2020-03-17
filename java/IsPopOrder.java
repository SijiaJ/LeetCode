package dayN;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 **/
//借助一个辅助栈
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null||popA==null||pushA.length==0||popA.length==0)return false;
        Stack<Integer> stack = new Stack<>();
        boolean res=false;
        int i=0;
        int j=0;
        while (i<popA.length){
            while (stack.empty()||popA[i]!=stack.peek()){
                if(j==pushA.length)break;
                stack.push(pushA[j++]);
            }
            if(popA[i]!=stack.peek())break;
            stack.pop();
            i++;
            if(stack.empty()&&i==popA.length){
                res=true;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        IsPopOrder I = new IsPopOrder();
        int []push={1,2,3,4,5};
        int []pop1={4,5,3,2,1};
        int []pop2={3,5,4,2,1};
        System.out.println(I.IsPopOrder(push,pop1));
        System.out.println(I.IsPopOrder(push,pop2));

    }
}
