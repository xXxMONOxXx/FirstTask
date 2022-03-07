package test.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayChange;
import by.mishastoma.customarray.service.impl.CustomArrayChangeImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayChangeImplTest {

    private final CustomArrayChange service = new CustomArrayChangeImpl();

    private final CustomArray baseArray = new CustomArray(2, -4, 12, 55, 0, 11);
    private final CustomArray zeroesArray = new CustomArray(0, 0, 0, 0, 0, 0, 0);
    private final CustomArray negativesArray = new CustomArray(-2, -4, -2, -5, -11, -7, -6);
    private final CustomArray positivesArray = new CustomArray(1, 4, 5, 7, 2, 4);
    private final CustomArray emptyArray = new CustomArray();

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
}
