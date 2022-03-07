package by.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayChange;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayChangeImpl implements CustomArrayChange {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void changeNegativeElementsToZero(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.isEmpty()) {
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
}
