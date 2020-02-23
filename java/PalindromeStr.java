package dayN;
/**
 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 说明：本题中，我们将空字符串定义为有效的回文串。

 示例 1:
 输入: "A man, a plan, a canal: Panama"
 输出: true

 示例 2:
 输入: "race a car"
 输出: false
 **/
public class PalindromeStr {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return true;
        s=s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if ((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                stringBuilder.append(s.charAt(i));
            }
        }
        if (stringBuilder.length()==0)return true;
        int begin =0;
        int end = stringBuilder.length()-1;
        while (begin<end){
            if (stringBuilder.charAt(begin)!=stringBuilder.charAt(end)){
                return false;
            }
            else {
                begin++;
                end--;
            }
        }
        System.out.println("true");
        return true;

    }

    public static void main(String[] args) {
        PalindromeStr s = new PalindromeStr();
        s.isPalindrome("A man, a plan, a canal: Panama");
    }
}
