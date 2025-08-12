package problems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LPSTest {

    @Test
    void LPS_OddTest(){
        LPS LPS = new LPS();
        String result = LPS.findLongestPal("asbsz");
        Assertions.assertEquals("sbs", result);
    }

    @Test
    void LPS_EvenTest(){
        LPS LPS = new LPS();
        String result = LPS.findLongestPal("assz");
        Assertions.assertEquals("ss", result);
    }

    @Test
    void LPS_FullTest(){
        LPS LPS = new LPS();
        String result = LPS.findLongestPal("asbebsa");
        Assertions.assertEquals("asbebsa", result);
    }

    @Test
    void LPS_NoneTest(){
        LPS LPS = new LPS();
        String result = LPS.findLongestPal("abcdefg");
        Assertions.assertEquals("", result);
    }
}