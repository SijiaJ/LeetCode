package day5;

public class CompMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        MouseImpl mouse = new MouseImpl();
        computer.usbDeivce(mouse);
        computer.powerOff();




    }
}
