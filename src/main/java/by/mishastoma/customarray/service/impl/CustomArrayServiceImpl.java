package by.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;
import java.util.stream.IntStream;


public class CustomArrayServiceImpl implements CustomArrayService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMaxElement(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            OptionalInt expectedMax = stream.max();
            logger.info("Maximum element: {}", expectedMax);
            return expectedMax.getAsInt();
        }
    }

    @Override
    public int findMinElement(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            OptionalInt expectedMin = stream.min();
            logger.info("Minimum element: {}", expectedMin);
            return expectedMin.getAsInt();
        }
    }

    @Override
    public int calculateSum(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            int sum = stream.sum();
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

    private boolean isNegative(int n) {
        return n < 0;
    }

    @Override
    public void changeNegativeElementsToZero(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
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
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            int numberOfNegativeElements = (int) stream.filter(element -> element < 0).count();
            logger.info("Number of negative elements: {}", numberOfNegativeElements);
            return numberOfNegativeElements;
        }
    }

    @Override
    public int calculateNumberOfPositiveElements(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            int numberOfPositiveElements = (int) stream.filter(element -> element > 0).count();
            logger.info("Number of positive elements: {}", numberOfPositiveElements);
            return numberOfPositiveElements;
        }
    }
}
