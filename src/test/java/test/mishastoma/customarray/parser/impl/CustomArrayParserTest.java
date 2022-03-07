package test.mishastoma.customarray.parser.impl;

import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.parser.CustomArrayParser;
import by.mishastoma.customarray.parser.impl.CustomArrayParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayParserTest {

    private final CustomArrayParser parser = new CustomArrayParserImpl();

    @Test
    public void mixedNumbersTest() throws CustomArrayException {
        int[] expected = {-7, 44, 1, -1, 11, 98, 0};
        int[] actual = parser.parse(" -7;   44;  1; -1   ; 11;         98;      0");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void positiveNumbersTest() throws CustomArrayException {
        int[] expected = {11, 10, 78, 44};
        int[] actual = parser.parse("11 ; 10; 78;       44    ");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void negativeNumbersTest() throws CustomArrayException {
        int[] expected = {-12, -11, -19, -28};
        int[] actual = parser.parse("-12; -11; -19;     - 28");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void exceptionTest() throws CustomArrayException {
        int[] actual = parser.parse("123; 3123x;123");
    }
}
