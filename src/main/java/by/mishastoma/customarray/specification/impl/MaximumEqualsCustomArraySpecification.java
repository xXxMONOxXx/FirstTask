package by.mishastoma.customarray.specification.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayFind;
import by.mishastoma.customarray.service.impl.CustomArrayFindImpl;
import by.mishastoma.customarray.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaximumEqualsCustomArraySpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();

    private final int comparable;

    public MaximumEqualsCustomArraySpecification (int comparable) {
        this.comparable = comparable;
    }

    @Override
    public boolean specify(CustomArray array){
        if(array.isEmpty()){
            return false;
        }
        boolean result = false;
        try{
            CustomArrayFind service = new CustomArrayFindImpl();
            int maximum = service.findMaxElement(array);
            result = (comparable == maximum);
        }
        catch (CustomArrayException e){
            logger.warn(e.getMessage());
        }
        return result;
    }
}
