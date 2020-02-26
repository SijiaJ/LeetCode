package dayN;
/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如:
 * 字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"及"-1E-16"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。
**/

/**
 1.小数点后为数字或者空
 2.+—符号在第一位或者e|E后面出现（-.124是表示数字-0.124,12.表示12.0）
 3.e|E后面必须跟数字或+—符号
 (判断小数点数量和e后面指数时可以定义标志位)
 * **/
public class isNumber {
    public static boolean isNumber(String s) {
        if (s==null)return false;
        boolean point=false;
        boolean exp = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='+'||s.charAt(i)=='-'){
                if(i+1==s.length()||!(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')){
                    return false;
                }
                if(!(i==0||s.charAt(i-1)=='e'||s.charAt(i-1)=='E')){
                    return false;
                }


            }else if(s.charAt(i)=='.'){
                if(point||exp||!(i+1<s.length()&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'||s.charAt(i+1)=='e'||s.charAt(i+1)=='E')){
                    return false;
                }
                point = true;
            }
            else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
                if(exp||i==0||i+1==s.length()||!(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'||s.charAt(i+1)=='+'||s.charAt(i+1)=='-')){
                    return false;
                }
                exp = true;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){

            }
            else return false;
        }
        return true;

    }


    public static void main(String[] args) {
        String s = "0123";
        String s0 = "e4";
        String s1 = "1.e3";
        String s2 = ".";
        double ss = 1.e3;
        System.out.println(ss);

        boolean result = isNumber(s);
        System.out.println(result);
    }
}
