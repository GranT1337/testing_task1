import com.ostanin.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    
    Utils utils;

    @BeforeEach
    void setUp() {
        utils = new Utils();
    }

    @AfterEach
    void tearDown() {
        utils = null;
    }

    @Test
    public void correctConcatenationOfWords() {
        assertEquals("Hello world", utils.concatenateWords("Hello ", "world"));
    }

    @Test
    public void concatenationOfWordsNull() {
        assertThrows(NullPointerException.class,
                ()-> utils.concatenateWords(null, null));
    }

    @Test
    public void concatenationOfFirstWordNull() {
        assertThrows(NullPointerException.class,
                ()-> utils.concatenateWords(null, "String"));
    }

    @Test
    public void concatenationOfSecondWordNull() {
        assertThrows(NullPointerException.class,
                ()-> utils.concatenateWords("String", null));
    }

    @Test
    public void concatenationTwoEmptyWords() {
        assertEquals("", utils.concatenateWords("", ""));
    }

    @Test
    public void testConcatenateNonLatin() {
        assertEquals("Русский not Russian", utils.concatenateWords("Русский ", "not Russian"));
    }

    @Test
    public void testConcatenateWithSigns() {
        assertEquals("Test &^%$(_&$", utils.concatenateWords("Test ", "&^%$(_&$"));
    }

    @Test
    public void testComputeFactorial() {
        long number = 148;
        BigInteger expectedResult = new BigInteger("25563239178728655885811780157767579432615452253248887777426566" +
                "3683131226509375384309291161023155754565445672835556394649497388144065702480833807378952671438" +
                "814060814746021382234117929711163143053268084074819321903521799864320000000000000000000000000000" +
                "0000000");
        BigInteger result = utils.computeFactorial(number);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testComputeFactorialWithNegativeNumber() {
        long number = -2;
        assertThrows(IllegalArgumentException.class,
                ()-> utils.computeFactorial(number));
    }



}
