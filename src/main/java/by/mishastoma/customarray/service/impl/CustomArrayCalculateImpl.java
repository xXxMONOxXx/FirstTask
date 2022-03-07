package by.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayCalculate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class CustomArrayCalculateImpl implements CustomArrayCalculate {

    private static final Logger logger = LogManager.getLogger();


    @Override
    public int calculateSum(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.isEmpty()) {
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



    @Override
    public int calculateNumberOfNegativeElements(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.isEmpty()) {
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
        if (entity == null || entity.isEmpty()) {
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
