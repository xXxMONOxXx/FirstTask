package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayService;
import by.mishastoma.customarray.service.impl.CustomArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinElementComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray){
        try{
            CustomArrayService service = new CustomArrayServiceImpl();
            int firstArrayMinElement = service.findMinElement(firstArray);
            int secondArrayMinElement = service.findMinElement(secondArray);
            return Integer.compare(firstArrayMinElement, secondArrayMinElement);
        }
        catch (CustomArrayException e){
            logger.error("Couldn't find minimum element for array with id {} or {}",
                    firstArray.getId(), secondArray.getId());
        }
        return 0;
    }
}
