package dayN;
/**
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 示例 1：

 输入：s = "We are happy."
 输出："We%20are%20happy."

 限制：
 0 <= s 的长度 <= 10000
**/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer s) {
        return s.toString().replace(" ","20%");
    }
    public static void main(String[] args) {
        ReplaceSpace str = new ReplaceSpace();
        StringBuffer s= new StringBuffer();
        s.append(' ');
        s.append('h');
        s.append('e');
        s.append(' ');
        System.out.println(str.replaceSpace(s));
        }
    }