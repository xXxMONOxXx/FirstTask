package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayService;
import by.mishastoma.customarray.service.impl.CustomArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        try {
            CustomArrayService service = new CustomArrayServiceImpl();
            int firstSum = service.calculateSum(firstArray);
            int secondSum = service.calculateSum(secondArray);
            return Integer.compare(firstSum, secondSum);
        } catch (CustomArrayException e) {
            logger.error("Couldn't calculate sum of array with id {} or {}.",
                    firstArray.getId(), secondArray.getId());
        }
        return 0; // Is it better to throw an exception?
    }
}
