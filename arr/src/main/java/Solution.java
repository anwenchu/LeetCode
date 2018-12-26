import bean.ListNode;

/**
 * Created by an_wch on 2018/11/13.
 */
public class Solution {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
//        listNode1.setNext(new ListNode(8));
//        listNode1.getNext().setNext(new ListNode(3));


        ListNode listNode2 = new ListNode(9);
        listNode2.setNext(new ListNode(9));
//        listNode2.getNext().setNext(new ListNode(4));

        addTwoNumbers(listNode1, listNode2);
//        addTwoNumbers2(listNode1, listNode2);
    }

    /**
     * 解法1
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (null != p || null != q) {
            int pv = null == p ? 0 : p.val;
            int qv = null == q ? 0 : q.val;
            int sum = pv + qv + carry;
            carry = sum / 10;
            curr.val = sum % 10;
            if (null != p  && null != q && (null != p.next || q.next != null || 0 < carry)) {
                curr.next = new ListNode(carry);
                curr = curr.next;

            }
            if (null != p ) {
                p = p.next;
            }
            if (null != q) {
                q = q.next;
            }

        }
        return dummyHead;
    }
    /**
     * 解法2
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
