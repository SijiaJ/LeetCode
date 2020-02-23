package dayN;
/**
 给定两个二进制字符串，返回他们的和（用二进制表示）。
 输入为非空字符串且只包含数字 1 和 0。

 示例 1:
 输入: a = "11", b = "1"
 输出: "100"

 示例 2:
 输入: a = "1010", b = "1011"
 输出: "10101"
**/
public class StrBinarySum {
    public String addBianry(String a, String b){
        StringBuilder res = new StringBuilder();
        int m= a.length()-1;
        int n= b.length()-1;
        int carry=0;
        while (m>=0||n>=0){
            int sum=carry;
            if(m>=0){
                sum+=a.charAt(m--)-'0';

            }
            if(n>=0){
                sum+=b.charAt(n--)-'0';
            }
            res.append(sum%2);
            carry=sum/2;

        }
            if(carry!=0){
                res.append(1);
            }
        System.out.println(res.reverse().toString());
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        StrBinarySum s = new StrBinarySum();
        String a="11101";
        String b="1001";
        s.addBianry(a,b);

    }
}
