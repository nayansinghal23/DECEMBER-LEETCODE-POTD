/*
 Approach :-
1) Take two List of Integer.
2) Store the odd index values in one List and even index values in another List.
3) First traverse back the odd index List values back to the Linked List, then traverse back the even index List values back to the Linked List.
*/

// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(N)

/*
 class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        ListNode temp = head;
        boolean oddNode = true;
        while(temp != null) {
            if(oddNode) {
                odd.add(temp.val);
                oddNode = false;
            }
            else {
                even.add(temp.val);
                oddNode = true;
            }
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        while(i < odd.size()) {
            temp.val = odd.get(i);
            i++;
            temp = temp.next;
        }
        i = 0;
        while(i < even.size()) {
            temp.val = even.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}
 */