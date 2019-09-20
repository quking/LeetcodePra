public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode head = l3;
        int bits = 0, sums = 0, varias;
        int p,q;
        while (l1 != null || l2 != null) {
            p = (l1 != null)?l1.val:0;
            q = (l2 != null)?l2.val:0;
            varias = p + q;
            sums = (varias+bits) % 10;   // 这个地方需要注意
            bits = (varias+bits) / 10;
            ListNode temp = new ListNode(sums);
            l3.next = temp;
            l3 = l3.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(bits != 0){
            ListNode temp = new ListNode(bits);
            l3.next = temp;
            l3 = l3.next;
        }
        l3.next = null;
        return head;
    }

    public static void main(String[] args) {
        int []e1 = {1};
        int []e2 = {9,9};
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode head1 = l1;
        ListNode head2 = l2;
        for (int i:e1){
            ListNode tep = new ListNode(i);
            l1.next = tep;
            l1 = l1.next;
        }
        l1.next = null;
        for (int i:e2){
            ListNode tep = new ListNode(i);
            l2.next = tep;
            l2 = l2.next;
        }
        l2.next = null;
//        while(head1.next != null){
//            System.out.print(head1.next.val+"->");
//            head1 = head1.next;
//        }
//        System.out.println();
//        while(head2.next != null){
//            System.out.print(head2.next.val+"->");
//            head2 = head2.next;
//        }
        AddTwoNumber a = new AddTwoNumber();
        ListNode h = a.addTwoNumbers(head1.next,head2.next);
        System.out.println("计算结果：");
        while(h.next != null){
            System.out.print(h.next.val+"->");
            h = h.next;
        }
    }
}

// 9 + 18
// 0 9
