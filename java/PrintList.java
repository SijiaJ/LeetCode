package dayN;
/**
 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 **/
import java.util.ArrayList;
import java.util.Collections;

public class PrintList {
    ListNode head = null;
    //添加节点
    public ListNode addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null)return list;
        while (listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public static void main(String[] args) {
        PrintList p = new PrintList();
        p.addNode(1);
        p.addNode(2);
        p.addNode(4);
        p.addNode(6);
        ListNode head = p.addNode(3);
        ArrayList<Integer> result = new ArrayList<>();
        result= p.printListFromTailToHead(head);
        System.out.println(result);

    }
}
