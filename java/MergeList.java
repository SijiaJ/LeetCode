package dayN;
/**
 输入两个单调递增的链表，输出两个链表合成后的链表，
 当然我们需要合成后的链表满足单调不减规则。
 **/
public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1 = list1.next;
            }else {
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        if(list1!=null)cur.next=list1;
        if(list2!=null)cur.next=list2;
        return head;
    }

    public static void main(String[] args) {

    }
}
