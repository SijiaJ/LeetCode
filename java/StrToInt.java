package dayN;
/**
 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 数值为0或者字符串不是一个合法的数值则返回0
 输入描述:
 输入一个字符串,包括数字字母符号,可以为空
 输出描述:
 如果是合法的数值表达则返回该数字，否则返回0
 示例1
 输入

 +2147483647
 1a33
 输出

 2147483647
 0
 **/

/**
 1.空串的判断str==null||"".equals(str)；
 2.正数和负数，首字符（+和-）并设置标志位标识正负（注意字符串只有一个+或-号情况）；
 3.越界判断，Interger.MAX_VALUE,Interger.MIN_VALUE（可设置中间变量暂存double类型）
 4.满足条件的转换
 res+=Math.pow(10,arr.length-1-i)*(arr[i]-'0');
 其中使用到String.substring,toCharArray
 Character.isDigit判断是否是数字类型
 **/
public class StrToInt {
    public int StrToInt(String str) {
        if(str==null||"".equals(str))return 0;
        boolean isFu=false;
        if(str.charAt(0)=='+'){
            if(str.length()==1)return 0;
            str=str.substring(1);
        }
        if(str.charAt(0)=='-'){
            if(str.length()==1)return 0;
            isFu=true;
            str=str.substring(1);
        }
        char []arr = str.toCharArray();
        double res=0;
        for(int i=0;i<arr.length;i++){
            if(!Character.isDigit(arr[i])){
                return 0;
            }else {
                res+=Math.pow(10,arr.length-1-i)*(arr[i]-'0');
            }
        }
        if(!isFu){
            if(res>Integer.MAX_VALUE)return 0;
            else return (int)res;
        }else {
            if(-res<Integer.MIN_VALUE)return 0;
            else return (int)(-res);
        }
    }

    public static void main(String[] args) {
        StrToInt S = new StrToInt();
        String str = "+";
//        String str = "+214748";
//        String str = "1a33";

        int res = S.StrToInt(str);
        System.out.println(res);
    }


}
