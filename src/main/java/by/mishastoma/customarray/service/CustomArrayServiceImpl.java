package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CustomArrayServiceImpl implements CustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMaxElement(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int expectedMax = Integer.MIN_VALUE;
            int[] array = entity.getArray();
            for (int element : array) {
                expectedMax = Integer.max(expectedMax, element);
            }
            logger.info("Maximum element: {}", expectedMax);
            return expectedMax;
        }
    }

    @Override
    public int findMinElement(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int expectedMin = Integer.MAX_VALUE;
            int[] array = entity.getArray();
            for (int element : array) {
                expectedMin = Integer.min(expectedMin, element);
            }
            logger.info("Minimum element: {}", expectedMin);
            return expectedMin;
        }
    }

    @Override
    public int calculateSum(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int sum = 0;
            int[] array = entity.getArray();
            for (int element : array) {
                sum += element;
            }
            logger.info("Sum of elements: {}", sum);
            return sum;
        }
    }

    @Override
    public double calculateAverage(CustomArray entity) throws CustomArrayException {
        double average = calculateSum(entity) * 1.0 / entity.length();
        logger.info("Average: {}", average);
        return average;
    }

    @Override
    public void changeNegativeElementsToZero(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int arrayLength = array.length;
            for (int i = 0; i < arrayLength; i++) {
                if (array[i] < 0) {
                    array[i] = 0;
                }
            }
            entity.setArray(array);
            logger.info("Changed negative elements to zero. Array: {}", array);
        }
    }

    @Override
    public int calculateNumberOfNegativeElements(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int numberOfNegativeElements = 0;
            for (int element : array) {
                if (element < 0) {
                    numberOfNegativeElements++;
                }
            }
            logger.info("Number of negative elements: {}", numberOfNegativeElements);
            return numberOfNegativeElements;
        }
    }

    @Override
    public int calculateNumberOfPositiveElements(CustomArray entity) throws CustomArrayException {
        if (entity.isEmpty()) {
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int numberOfPositiveElements = 0;
            for (int element : array) {
                if (element > 0) {
                    numberOfPositiveElements++;
                }
            }
            logger.info("Number of positive elements: {}", numberOfPositiveElements);
            return numberOfPositiveElements;
        }
    }
}
