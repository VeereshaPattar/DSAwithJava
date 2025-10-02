/**
 * Definition for singly-linked list. */
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode processingLL = new ListNode();
        ListNode resLL = processingLL;
        while(l1 !=null || l2 != null || carry != 0)
        {

            int SumVal = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0 ) + carry;
            carry = SumVal/10;
            processingLL.val = SumVal%10;
            processingLL.next = new ListNode();
            if(l1!= null) l1=  l1.next;
            l2!= null l2 = l2.next;

        }
        return resLL;
    }
}



 int[] lastIndex = new int[128]; // stores last index + 1
        int maxCount = 0; //1
        left = 0; //0,
        for (int right = 0; right < s.length(); right++) { //right=2
            char ch = s.charAt(right); //p
            left = Math.max(left, lastIndex[ch]);
            maxCount = Math.max(maxCount, right - left + 1);
            lastIndex[ch] = right + 1;
        }
        return maxCount;