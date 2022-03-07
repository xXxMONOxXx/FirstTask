package by.mishastoma.customarray.specification.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LengthLessCustomArraySpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();

    private final int comparable;

    public LengthLessCustomArraySpecification (int comparable) {
        this.comparable = comparable;
    }

    @Override
    public boolean specify(CustomArray array){
        if(array.isEmpty()){
            return false;
        }
        return comparable > array.length();
    }
}
