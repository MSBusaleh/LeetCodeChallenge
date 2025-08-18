package problems;
import org.junit.jupiter.api.Test;
import problems.LLAddition.LLAddition;
import problems.LLAddition.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class LLAdditionTest {
    private static void assertEqualList(ListNode expected, ListNode actual){
        while(expected != null && actual != null){
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

    @Test
    void addTwoNumbers_equalLengthsWithCarry() {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(3,new ListNode(7)));

        ListNode expected = new ListNode(7, new ListNode(7, new ListNode(0, new ListNode(1))));

        LLAddition lla = new LLAddition();
        ListNode actual = lla.addTwoNumbers(l1, l2);
        assertEqualList(expected, actual);
    }

    @Test
    void addTwoNumbers_twoZeros() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        LLAddition lla = new LLAddition();
        ListNode actual = lla.addTwoNumbers(l1, l2);
        assertEqualList(expected, actual);
    }

    @Test
    void addTwoNumbers_differentLengths() {
        ListNode l1 = new ListNode(3, new ListNode(5, new ListNode(7)));
        ListNode l2 = new ListNode(5);
        ListNode expected = new ListNode(8, new ListNode(5, new ListNode(7)));

        LLAddition lla = new LLAddition();
        ListNode actual = lla.addTwoNumbers(l1, l2);
        assertEqualList(expected, actual);
    }

    @Test
    void addTwoNumbers_differentLengthsWithCarry() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(1)))));

        LLAddition lla = new LLAddition();
        ListNode actual = lla.addTwoNumbers(l1, l2);
        assertEqualList(expected, actual);
    }
}