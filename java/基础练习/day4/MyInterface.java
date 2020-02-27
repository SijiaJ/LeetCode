package day4;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void methods();
    public default void methodA(){
        System.out.println("默认方法调用");
    }

}
