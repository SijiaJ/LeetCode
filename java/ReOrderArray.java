package dayN;

import java.util.ArrayList;

/**
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 **/
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> listodd = new ArrayList<>();
        ArrayList<Integer> listeven = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                listodd.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                listeven.add(array[i]);
            }
        }
        for (int i = 0; i < listodd.size(); i++) {
            array[i] = listodd.get(i);
        }
        int count = listodd.size();
        for(int j = 0;j<listeven.size();j++){
            array[count++]=listeven.get(j);
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
    }

    public static void main(String[] args) {
        ReOrderArray r = new ReOrderArray();
        int [] arr = {1,2,2,2,4,3,3,5,6};
        r.reOrderArray(arr);
    }
}
