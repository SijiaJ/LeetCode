package day3;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney, int num){
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = this.getMoney();
        if(totalMoney>this.getMoney()){
            System.out.println("太穷了");
            return list;
        }else {
            this.setMoney(leftMoney-totalMoney);
        }

        int avg = totalMoney/num;
        int mod = totalMoney%num;
        for (int i = 0; i < num-1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
    public void show(){
        System.out.println(super.getMoney());
        System.out.println(this.getMoney());
    }

}
