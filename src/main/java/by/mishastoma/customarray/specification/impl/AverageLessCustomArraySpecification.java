package by.mishastoma.customarray.specification.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArrayCalculate;
import by.mishastoma.customarray.service.impl.CustomArrayCalculateImpl;
import by.mishastoma.customarray.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageLessCustomArraySpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();

    private final int comparable;

    public AverageLessCustomArraySpecification (int comparable) {
        this.comparable = comparable;
    }

    @Override
    public boolean specify(CustomArray array){
        if (array.isEmpty()) {
            return false;
        }
        boolean result = false;
        try {
            CustomArrayCalculate service = new CustomArrayCalculateImpl();
            double average = service.calculateAverage(array);
            result = (comparable > average);
        } catch (CustomArrayException e) {
            logger.warn(e.getMessage());
        }
        return result;
    }
}
