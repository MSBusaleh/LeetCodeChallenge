package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseIntTest {

    @Test
    void ReverseInt_negativeTest(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverse(-321);
        Assertions.assertEquals(-123, result);
    }

    @Test
    void ReverseInt_positiveTest(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverse(12345);
        Assertions.assertEquals(54321, result);
    }

    @Test
    void ReverseInt_zeroTest(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverse(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void ReverseInt_limitTest(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverse(1000000003);
        Assertions.assertEquals(0, result);
    }
}