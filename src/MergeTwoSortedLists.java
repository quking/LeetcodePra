/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                l3.next = l2;
                l2 = l2.next;
            }else{
                l3.next = l1;
                l1 = l1.next;
            }
            l3 = l3.next;
        }
        if(l1 == null && l2 != null)
            l3.next = l2;
        if(l1 != null && l2 == null)
            l3.next = l1;
        return head.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        int []e1 = {1,2,4};
        int []e2 = {1,3,4};
        ListNode l1 = new ListNode(0);
        ListNode h1 = l1;
        for(int i: e1){
            ListNode temp = new ListNode(i);
            l1.next = temp;
            l1 = l1.next;
        }
        l1.next = null;
//        l1 = null;
//        ListNode l2 = new ListNode(0);
//        ListNode h2 = l2;
//        for(int i: e2){
//            l2.val = i;
//            l2 = l1.next;
//        }
//        l2 = null;
//
//        ListNode l3 = m.mergeTwoLists(h1, h2);
        while(h1.next!= null){
            System.out.print(h1.next.val+"->");
            h1 = h1.next;
        }
    }
}
