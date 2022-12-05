// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(1)

/*
class Solution {
    public ListNode middleNode(ListNode head) {
        int totalNodes = 0;
        ListNode temp = head;
        while(temp != null) {
            totalNodes++;
            temp = temp.next;
        }
        totalNodes /= 2;
        temp = head;
        while(totalNodes != 0) {
            totalNodes--;
            temp = temp.next;
        }
        return temp;
    }
}
*/