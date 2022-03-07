package test.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayFind;
import by.mishastoma.customarray.service.impl.CustomArrayFindImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayFindImplTest {

    private final CustomArrayFind service = new CustomArrayFindImpl();

    private final CustomArray baseArray = new CustomArray(2, -4, 12, 55, 0, 11);
    private final CustomArray zeroesArray = new CustomArray(0, 0, 0, 0, 0, 0, 0);
    private final CustomArray negativesArray = new CustomArray(-2, -4, -2, -5, -11, -7, -6);
    private final CustomArray positivesArray = new CustomArray(1, 4, 5, 7, 2, 4);
    private final CustomArray emptyArray = new CustomArray();

    @Test
    public void findMaxElementBaseTest() throws CustomArrayException {
        int expected = 55;
        int actual = service.findMaxElement(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMaxElementZeroesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.findMaxElement(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMaxElementNegativesTest() throws CustomArrayException {
        int expected = -2;
        int actual = service.findMaxElement(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMaxElementPositivesTest() throws CustomArrayException {
        int expected = 7;
        int actual = service.findMaxElement(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findMaxElementEmptyTest() throws CustomArrayException {
        service.findMaxElement(emptyArray);
    }

    @Test
    public void findMinElementBaseTest() throws CustomArrayException {
        int expected = -4;
        int actual = service.findMinElement(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMinElementZeroesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.findMinElement(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMinElementNegativesTest() throws CustomArrayException {
        int expected = -11;
        int actual = service.findMinElement(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMinElementPositiveTest() throws CustomArrayException {
        int expected = 1;
        int actual = service.findMinElement(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findMinElementEmptyTest() throws CustomArrayException {
        service.findMinElement(emptyArray);
    }
}
