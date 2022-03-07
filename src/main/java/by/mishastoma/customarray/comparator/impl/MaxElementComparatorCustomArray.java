package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayFind;
import by.mishastoma.customarray.service.impl.CustomArrayFindImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxElementComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray){
        try{
            CustomArrayFind service = new CustomArrayFindImpl();
            int firstArrayMaxElement = service.findMaxElement(firstArray);
            int secondArrayMaxElement = service.findMaxElement(secondArray);
            return Integer.compare(firstArrayMaxElement, secondArrayMaxElement);
        }
        catch (CustomArrayException e){
            logger.error("Couldn't find maximum element for array with id {} or {}",
                    firstArray.getId(), secondArray.getId());
        }
        return 0;
    }
}
