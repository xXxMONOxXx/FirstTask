package test.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArraySort;
import by.mishastoma.customarray.service.impl.CustomArraySortImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArraySortTest {

    private final CustomArraySort sort = new CustomArraySortImpl();

    private final CustomArray baseArray = new CustomArray(new int[]{2, -4, 12, 55, 0, 11});
    private final int[] baseArraySorted = new int[]{-4, 0, 2, 11, 12, 55};
    private final CustomArray zeroesArray = new CustomArray(new int[]{0, 0, 0, 0, 0, 0, 0});
    private final int[] zeroesArraySorted = new int[]{0, 0, 0, 0, 0, 0, 0};
    private final CustomArray negativesArray = new CustomArray(new int[]{-2, -4, -2, -5, -11, -7, -6});
    private final int[] negativesArraySorted = new int[]{-11, -7, -6, -5, -4, -2, -2};
    private final CustomArray positivesArray = new CustomArray(new int[]{1, 4, 5, 7, 2, 4});
    private final int[] positivesArraySorted = new int[]{1, 2, 4, 4, 5, 7};
    private final CustomArray nullArray = new CustomArray(new int[]{});

    @Test
    public void bubbleSortBaseTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(baseArray.getArray());
        sort.bubbleSort(entity);
        Assert.assertEquals(entity.getArray(), baseArraySorted);
    }

    @Test
    public void bubbleSortZeroesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(zeroesArray.getArray());
        sort.bubbleSort(entity);
        Assert.assertEquals(entity.getArray(), zeroesArraySorted);
    }

    @Test
    public void bubbleSortNegativesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(negativesArray.getArray());
        sort.bubbleSort(entity);
        Assert.assertEquals(entity.getArray(), negativesArraySorted);
    }

    @Test
    public void bubbleSortPositivesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(positivesArray.getArray());
        sort.bubbleSort(entity);
        Assert.assertEquals(entity.getArray(), positivesArraySorted);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void bubbleSortNullTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(nullArray.getArray());
        sort.bubbleSort(entity);
    }

    @Test
    public void selectionSortBaseTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(baseArray.getArray());
        sort.selectionSort(entity);
        Assert.assertEquals(entity.getArray(), baseArraySorted);
    }

    @Test
    public void selectionSortZeroesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(zeroesArray.getArray());
        sort.selectionSort(entity);
        Assert.assertEquals(entity.getArray(), zeroesArraySorted);
    }

    @Test
    public void selectionSortNegativesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(negativesArray.getArray());
        sort.selectionSort(entity);
        Assert.assertEquals(entity.getArray(), negativesArraySorted);
    }

    @Test
    public void selectionSortPositivesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(positivesArray.getArray());
        sort.selectionSort(entity);
        Assert.assertEquals(entity.getArray(), positivesArraySorted);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void selectionSortNullTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(nullArray.getArray());
        sort.selectionSort(entity);
    }

    @Test
    public void gnomeSortBaseTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(baseArray.getArray());
        sort.gnomeSort(entity);
        Assert.assertEquals(entity.getArray(), baseArraySorted);
    }

    @Test
    public void gnomeSortZeroesTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(zeroesArray.getArray());
        sort.gnomeSort(entity);
        Assert.assertEquals(entity.getArray(), zeroesArraySorted);
    }

    @Test
    public void gnomeSortNegativeTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(negativesArray.getArray());
        sort.gnomeSort(entity);
        Assert.assertEquals(entity.getArray(), negativesArraySorted);
    }

    @Test
    public void gnomeSortPositiveTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(positivesArray.getArray());
        sort.gnomeSort(entity);
        Assert.assertEquals(entity.getArray(), positivesArraySorted);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void gnomeSortNullTest() throws CustomArrayException {
        CustomArray entity = new CustomArray(nullArray.getArray());
        sort.gnomeSort(entity);
    }
}
