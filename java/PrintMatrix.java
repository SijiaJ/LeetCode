package dayN;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *  例如，如果输入如下4 X 4矩阵：
 *  1 2 3 4
 *  5 6 7 8
 *  9 10 11 12
 *  13 14 15 16
 *  * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 **/
//定义上下左右四个边界，不断缩小边界，容易理解
import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList list = new ArrayList();
        if(matrix==null||matrix.length==0)return list;
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while (true){
            //从左到右
            for(int col=up;col<=right;col++){
                list.add(matrix[up][col]);
            }
            up++;
            if(up>down)break;
            //从上到下
            for(int row=up;row<=down;row++){
                list.add(matrix[row][right]);
            }
            right--;
            if(left>right)break;
            for(int col=right;col>=left;col--){
                list.add(matrix[down][col]);
            }
            down--;
            if(up>down)break;
            for(int row = down;row>=up;row--){
                list.add(matrix[row][left]);
            }
            left++;
            if (left>right)break;
        }
        return list;
    }

    public static void main(String[] args) {
        PrintMatrix p =new PrintMatrix();
        ArrayList res = new ArrayList();
        int[][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        res = p.printMatrix(arr);
        System.out.println(res);
    }
}
