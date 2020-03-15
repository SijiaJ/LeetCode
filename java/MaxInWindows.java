package dayN;
/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}，
 * {2,[3,4,2],6,2,5,1}，{2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 **/
//滑动窗口个数为数组num长度+1减去滑动窗口大小，用集合list存储每个滑动窗口
//并借助Collections.sort对list排序求最大值，讲最大值添加到最终输出的集合res。
import java.util.ArrayList;
import java.util.Collections;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(num==null||num.length==0||size==0)return res;
        int count = num.length+1-size;
        for (int i =0;i<count;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i;j<size+i;j++){
                list.add(num[j]);
            }
            Collections.sort(list);
            res.add(list.get(size-1));
        }
        return res;
    }

    public static void main(String[] args) {
        MaxInWindows m = new MaxInWindows();
        int[] arr = {2,3,4,2,6,2,5,1};
        System.out.println(m.maxInWindows(arr,3));
    }
}
