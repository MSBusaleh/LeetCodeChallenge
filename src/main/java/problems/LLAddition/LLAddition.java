package problems.LLAddition;
/*
Problem Statement:
    Given two linked lists representing two non-negative integers. The digits
     are stored in reverse order, and each node contains a single digit. Add
     the two numbers and return the sum as a linked list.

    ### Medium level problem ###

Constraints:
    - Assume the lists are non-empty lists
    - Assume no leading zeros (i.e. 000101)

Approach:
    Recursive function

Complexity:
    Time = O(max(n, m))
    Space = O(n)
*/

public class LLAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0 &&
                l1.next == null && l2.next == null
        ) {
            return new ListNode(0);

        } else {
            return addTwoNumbersHelper(l1, l2, 0);
        }
    }

    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return carry == 1 ? new ListNode(1) : null;

        } else {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int nextCarry = 0;

            int currentVal = val1 + val2 + carry;
            if (currentVal > 9) {
                currentVal = currentVal % 10;
                nextCarry = 1;
            }

            return new ListNode(currentVal,
                    addTwoNumbersHelper(
                            l1 != null? l1.next : null,
                            l2 != null? l2.next : null,
                            nextCarry));
        }
    }

}