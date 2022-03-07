package by.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayFind;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CustomArrayFindImpl implements CustomArrayFind {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMaxElement(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.isEmpty()) {
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
        if (entity == null || entity.isEmpty()) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            IntStream stream = IntStream.of(entity.getArray());
            OptionalInt expectedMin = stream.min();
            logger.info("Minimum element: {}", expectedMin);
            return expectedMin.getAsInt();
        }
    }
}
