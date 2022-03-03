package by.mishastoma.customarray.comparator.impl;

import by.mishastoma.customarray.comparator.CustomComparator;
import by.mishastoma.customarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutionException;

public class LengthComparatorCustomArray implements CustomComparator {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int compare(CustomArray firstArray, CustomArray secondArray){
        try{
            return Integer.compare(firstArray.length(), secondArray.length());
        }
        catch (Exception e){
            logger.error("Couldn't calculate length of array with id {} or {}.",
                    firstArray.getId(), secondArray.getId());
        }
        return 0;
    }
}
