package dayN;
/*
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
*/

public class ListnodeOfLoop {
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

    public ListNode getLastNode(){
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void printLink(){
        ListNode curNode = head;
        while(curNode !=null){
            System.out.print(curNode.val+" ");
            curNode = curNode.next;
        }
        System.out.println();
    }
    //判断是否有环，并返回环起始点
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null)return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        boolean flag = false;

        while (fast.next!=null&&fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag){
            return null;
        } else {
            int count=1;
            slow = slow.next;
            while (slow!=fast){
                slow = slow.next;
                count++;
            }

        fast= slow =pHead;
        for (int i = 0; i < count; i++) {
            slow = slow.next;
        }
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

        }
    }

    public static void main(String[] args) {
        ListnodeOfLoop mylist = new ListnodeOfLoop();
        System.out.println("========");
        mylist.addNode(1);
        mylist.addNode(2);
        mylist.addNode(4);
        mylist.addNode(6);
        ListNode head = mylist.addNode(3);
        System.out.println(head.val);
        mylist.printLink();

        ListNode p = mylist.EntryNodeOfLoop(head);
        System.out.println("链表是否有环：" + p);
        //将链表的最后一个结点指向头结点，制造有环的效果
        ListNode lastNode = mylist.getLastNode();
        lastNode.next = mylist.head.next.next;
        ListNode q = mylist.EntryNodeOfLoop(head);
        System.out.println("链表是否有环：" + q.val);
    }

}
