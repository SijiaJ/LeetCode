package day4;

//引用类型,最重要的是抽象方法
//java7
//1.常量，2.抽象方法
//java8
//3.默认方法，4.静态方法
//java9
//私有方法
public class demoInterface {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.methods();
        myInterface.methodA();
    }
}
