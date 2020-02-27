package day1;

public class Employee {
    private int num = 100;
    private String name="jsj";
    static String id = "110";

    public Employee(){
        System.out.println("父类无参构造方法");
    }
    public Employee(int num){
        System.out.println(num);
        System.out.println(this.num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void method(){
        System.out.println("方法执行");
    }
}
