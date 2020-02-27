package day3;

import java.util.ArrayList;

public class redMain {
    public static void main(String[] args) {
        Manager manager = new Manager("j",100);
        manager.show();
        ArrayList<Integer>list= manager.send(20,3);
        Member member1 = new Member("q",40);
        Member member2 = new Member("w",140);
        Member member3 = new Member("e",11);
        System.out.println(manager.getMoney());
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        System.out.println(member1.getMoney());
        System.out.println(member2.getMoney());
        System.out.println(member3.getMoney());

    }
}
