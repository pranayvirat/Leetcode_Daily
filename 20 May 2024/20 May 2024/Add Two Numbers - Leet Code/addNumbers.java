/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        
        ListNode result = temp;

        int carry = 0;

        while( l1 != null || l2 != null){
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;

            int sum = num1 + num2 + carry;

            carry = sum/10;
            int digit = sum%10;

            ListNode t1 = new ListNode(digit);

            result.next = t1;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            result = result.next;

        }

        if(carry>0){
            ListNode t1 = new ListNode(carry);
            result.next = t1;
            result = result.next;
        }
        
        return temp.next;
    }
}