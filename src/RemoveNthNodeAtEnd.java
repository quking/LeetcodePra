public class RemoveNthNodeAtEnd {
    /**
     * Given a linked list, remove the n-th node from the end of list and return its head.
     * Example:
     *
     * Given linked list: 1->2->3->4->5, and n = 2.
     *
     * After removing the second node from the end, the linked list becomes 1->2->3->5.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head;
        ListNode p = head;
        ListNode q = p;
        int c = 0;
        while(p.next != null) {
            if (c >= n)
                q = q.next;
            p = p.next;
            c++;
        }
        if(c < n) return null;
        ListNode temp = q.next;
        q.next = temp.next;
        return head;
    }
    public static void main(String[] args) {
        int[] e1 = {1, 2,3,4,5};

        ListNode l1 = new ListNode(-1);
        ListNode head1 = l1;
        for (int i : e1) {
            ListNode tep = new ListNode(i);
            l1.next = tep;
            l1 = l1.next;
        }
        l1.next = null;
        RemoveNthNodeAtEnd r = new RemoveNthNodeAtEnd();
        ListNode head = r.removeNthFromEnd(head1, 2);
        while(head.next != null){
            System.out.print(head.next.val+"->");
            head = head.next;
        }
    }

    /**
     * 这里有点坑。leetcode上的head节点是指首节点而非头节点，之前一直以为给的头节点，本代码也是基于头节点，提交的代码是首节点的代码
     */
}
