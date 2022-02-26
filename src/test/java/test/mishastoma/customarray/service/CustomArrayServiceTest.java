package test.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayService;
import by.mishastoma.customarray.service.impl.CustomArrayServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayServiceTest {

    private final CustomArrayService service = new CustomArrayServiceImpl();

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

    @Test
    public void calculateAverageBaseTest() throws CustomArrayException {
        double expected = 12.666666666666666;
        double actual = service.calculateAverage(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAverageZeroesTest() throws CustomArrayException {
        double expected = 0;
        double actual = service.calculateAverage(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAverageNegativesTest() throws CustomArrayException {
        double expected = -5.285714285714286;
        double actual = service.calculateAverage(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAveragePositivesTest() throws CustomArrayException {
        double expected = 3.8333333333333335;
        double actual = service.calculateAverage(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void calculateAverageEmptyTest() throws CustomArrayException {
        service.calculateAverage(emptyArray);
    }

    @Test
    public void calculateSumBaseTest() throws CustomArrayException {
        int expected = 76;
        int actual = service.calculateSum(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateSumZeroesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.calculateSum(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateSumNegativesTest() throws CustomArrayException {
        int expected = -37;
        int actual = service.calculateSum(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateSumPositivesTest() throws CustomArrayException {
        int expected = 23;
        int actual = service.calculateSum(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void calculateSumEmptyTest() throws CustomArrayException {
        service.calculateSum(emptyArray);
    }

    @Test
    public void changeNegativeElementsToZeroBaseTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(baseArray.getArray());
        int[] expected = {2, 0, 12, 55, 0, 11};
        service.changeNegativeElementsToZero(entity);
        int[] actual = entity.getArray();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void changeNegativeElementsToZeroZeroesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(zeroesArray.getArray());
        int[] expected = {0, 0, 0, 0, 0, 0, 0};
        service.changeNegativeElementsToZero(entity);
        int[] actual = entity.getArray();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void changeNegativeElementsToZeroNegativesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(negativesArray.getArray());
        int[] expected = {0, 0, 0, 0, 0, 0, 0};
        service.changeNegativeElementsToZero(entity);
        int[] actual = entity.getArray();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void changeNegativeElementsToZeroPositivesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(positivesArray.getArray());
        int[] expected = {1, 4, 5, 7, 2, 4};
        service.changeNegativeElementsToZero(entity);
        int[] actual = entity.getArray();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void changeNegativeElementsToZeroEmptyTest() throws CustomArrayException {
        service.changeNegativeElementsToZero(emptyArray);
    }

    @Test
    public void calculateNumberOfNegativeElementsBaseTest() throws CustomArrayException {
        int expected = 1;
        int actual = service.calculateNumberOfNegativeElements(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfNegativeElementsZeroesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.calculateNumberOfNegativeElements(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfNegativeElementsNegativesTest() throws CustomArrayException {
        int expected = 7;
        int actual = service.calculateNumberOfNegativeElements(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfNegativeElementsPositivesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.calculateNumberOfNegativeElements(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void calculateNumberOfNegativeElementsEmptyTest() throws CustomArrayException {
        service.calculateNumberOfNegativeElements(emptyArray);
    }

    @Test
    public void calculateNumberOfPositiveElementsBaseTest() throws CustomArrayException {
        int expected = 4;
        int actual = service.calculateNumberOfPositiveElements(baseArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfPositiveElementsZeroesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.calculateNumberOfPositiveElements(zeroesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfPositiveElementsNegativesTest() throws CustomArrayException {
        int expected = 0;
        int actual = service.calculateNumberOfPositiveElements(negativesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateNumberOfPositiveElementsPositivesTest() throws CustomArrayException {
        int expected = 6;
        int actual = service.calculateNumberOfPositiveElements(positivesArray);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void calculateNumberOfPositiveElementsEmptyTest() throws CustomArrayException {
        service.calculateNumberOfPositiveElements(emptyArray);
    }
}