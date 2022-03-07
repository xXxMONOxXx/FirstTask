package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayCalculate;
import by.mishastoma.customarray.service.impl.CustomArrayCalculateImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray){
        try {
            CustomArrayCalculate service = new CustomArrayCalculateImpl();
            double firstArrayAverage = service.calculateAverage(firstArray);
            double secondArrayAverage = service.calculateAverage(secondArray);
            return Double.compare(firstArrayAverage,secondArrayAverage);
        }
        catch (CustomArrayException e){
            logger.error("Couldn't calculate average for array with id {} or {}",
                    firstArray.getId(), secondArray.getId());
        }
        return 0;
    }
}
