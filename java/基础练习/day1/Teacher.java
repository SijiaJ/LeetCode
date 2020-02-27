package day1;

public class Teacher extends Employee {
    private int  num = 20;

    public Teacher(){
        super(10);
        super.getName();
        System.out.println("子类无参构造方法");
    }
    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    public void methodA(){
        System.out.println("===");
    }
    public void methodB(){
        method();
    }
}
