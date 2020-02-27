package day3;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer>list){
            int index = new Random().nextInt(list.size());
            int money = this.getMoney();
            this.setMoney(money+list.get(index));
            list.remove(index);


    }


}
