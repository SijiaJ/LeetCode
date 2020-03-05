package dayN;
/**
 给定一个double类型的浮点数base和int类型的整数exponent。
 求base的exponent次方。
 保证base和exponent不同时为0
 **/
public class Power {
    public double Power(double base, int exponent) {
        double result = 1.0;
        if(exponent<0){
            for (int i=0;i<-exponent;i++){
                result*=base;
            }
            result = 1/result;
        }
        else {
            for (int i=0;i<exponent;i++){
                result*=base;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Power p = new Power();
        double r = p.Power(2.0,-3);
        System.out.println(r);
    }
}
