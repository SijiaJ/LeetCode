package xiu;

public class IsOdd {
    public boolean isOdd(int i){
        return (i&1)==1;
    }
    public boolean isodd(int i){
        return i%2!=0;
    }

    public static void main(String[] args) {
        IsOdd o =new IsOdd();
        System.out.println(o.isOdd(-4309549));
        System.out.println(o.isodd(-4309549));
    }
}
