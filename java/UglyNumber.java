package dayN;


/**
 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 例如6、8都是丑数，但14不是，因为它包含质因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 **/
public class UglyNumber {
//    public boolean isUglyNumber(int num){
//        while (num%2==0){
//            num/=2;
//        }
//        while (num%3==0){
//            num/=3;
//        }
//        while (num%5==0){
//            num/=5;
//        }
//        return (num==1)?true:false;
//    }
//    public int GetUglyNumber_Solution(int index) {
//        int count = 0;
//        int number = 0;
//        while (count<index){
//            number++;
//            if(isUglyNumber(number)){
//                count++;
//                //System.out.println(count);
//            }
//        }
//        return count;
//    }
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)return 0;
        int[] arr = new int[index];
        arr[0]=1;
        int p2=0,p3=0,p5=0;
        for (int i =1;i<index;i++){
            arr[i]=Math.min(arr[p2]*2,Math.min(arr[p3]*3,arr[p5]*5));
            if(arr[i]==arr[p2]*2)p2++;
            if(arr[i]==arr[p3]*3)p3++;
            if(arr[i]==arr[p5]*5)p5++;
        }
        return arr[index-1];


    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        int result = u.GetUglyNumber_Solution(5);
        System.out.println(result);
    }
}
