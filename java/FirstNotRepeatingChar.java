package dayN;
/**
 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 **/
import java.util.LinkedHashMap;

public class FirstNotRepeatingChar {
    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
    public void insert(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
    }
    public int FirstNotRepeatingChar(String str) {
        insert(str);
        System.out.println(map);
        for(Character c: map.keySet()){
            if(map.get(c)==1)
                return str.indexOf(c);
        }
        return 0;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar f = new FirstNotRepeatingChar();
        String s = "rsrdadabasdfwdfbmml";

        int result = f.FirstNotRepeatingChar(s);
        System.out.println(result);

    }
}
