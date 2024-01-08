// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.


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
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0; // set default carry

        while (l1 != null || l2 != null){
            int sum = 0 + carry ; // initialize sum

            if (l1 != null) { // Use number from firstlist
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) { // use number from second list 
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum /10; //get sum and carry
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry ==1 ) ptr.next = new ListNode(1);
        return result.next;
    }
}

https://leetcode.com/problems/add-two-numbers/submissions/1140446608
