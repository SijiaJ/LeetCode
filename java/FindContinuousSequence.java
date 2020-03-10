package dayN;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
 * Good Luck!
 输出描述:
 输出所有和为S的连续正数序列。
 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 **/
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<=sum/2+1;i++){
            int count = 0;
            int res = 0;
            int j=i;
            int temp = j;
            while (res<sum&&j<=sum/2+1){
                count++;
                res+=j++;
                System.out.println(res);
            }
            if(count>=2&&res==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int k= 0;k<count;k++){
                    list.add(temp++);
                }
                result.add(list);
                //list=new ArrayList<>();
            }

        }
        return result;
    }

    public static void main(String[] args) {
        FindContinuousSequence f = new FindContinuousSequence();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res = f.FindContinuousSequence(100);
        System.out.println(res);
    }
}
