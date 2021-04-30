import java.math.BigInteger;

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
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        String pstr = "";
        String qstr = "";
        ListNode curr = dummyHead;
        
        //create string of Linked List l1
        while (p != null){
            String val = Integer.toString(p.val);
            pstr = pstr + val;
            p = p.next;
        }
        
        //create string of Linked List l2
        while (q != null){
            String val = Integer.toString(q.val);
            qstr = qstr + val;
            q = q.next;
        }
        
        //reverse strings so that they are normal
        String pstr2 = reverse(pstr);
        String qstr2 = reverse(qstr);
        
        //convert strings to int
        BigInteger pbig = new BigInteger(pstr2);
        BigInteger qbig = new BigInteger(qstr2);
        // long plong=Long.parseLong(pstr2);  
        // long qlong=Long.parseLong(qstr2);
        
        //add ints
        BigInteger sum = pbig.add(qbig);
        
        String final_value = sum.toString();
        int len = final_value.length();
        
        for (int i = len -1; i >= 0; i--){
            String sub = final_value.substring(i,i+1);
            int val_int = Integer.parseInt(sub);
            // curr = val_int;
            curr.next = new ListNode(val_int);
            curr = curr.next;
        }
        
        
        
        return dummyHead.next;
        
    }
    
    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}