package day5;

public class Computer {
    public void powerOn(){
        System.out.println("on");
    }
    public void powerOff(){
        System.out.println("off");
    }
    public void usbDeivce(UsbInterface usb){
        usb.open();
        if(usb instanceof MouseImpl){
            MouseImpl mouse = (MouseImpl)usb;
            mouse.click();
        }else if(usb instanceof KeyBoardImpl){
            KeyBoardImpl keyBoard = (KeyBoardImpl)usb;//向下转型
            keyBoard.type();
        }
        usb.close();

    }
}
