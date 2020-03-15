package dayN;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，
 * 使用GetMedian()方法获取当前读取数据的中位数。
 **/
//用集合实现，每次将输入的数加入集合，并利用Collections.sort排序
//取出中位数根据list集合中个数奇偶判断即可。
public class MidNum {
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
        System.out.println(list);
    }

    public Double GetMedian() {
        if (list.size()%2==0){
            return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
        }else {
            return list.get(list.size()/2)/1.0;
        }
    }

    public static void main(String[] args) {
        MidNum m = new MidNum();
        m.Insert(1);
        m.Insert(4);
        m.Insert(9);
        m.Insert(3);
//        m.Insert(4);
//        m.Insert(6);
//        m.Insert(5);
//        m.Insert(9);
//        m.Insert(2);
        double res = m.GetMedian();
        System.out.println(res);
    }
}
