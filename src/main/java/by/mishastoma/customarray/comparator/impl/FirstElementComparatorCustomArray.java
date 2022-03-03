package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstElementComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        try {
            int firstElementOfFirstArray = firstArray.getElement(0);
            int firstElementOfSecondArray = secondArray.getElement(0);
            return Integer.compare(firstElementOfFirstArray, firstElementOfSecondArray);
        } catch (Exception e) {
            logger.error("Couldn't reach first element of array with id {} or {}.",
                    firstArray.getId(), secondArray.getId());
        }
        return 0; // ???
    }
}
