package by.mishastoma.customarray.specification.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotEmptyCustomArraySpecification implements Specification {

    @Override
    public boolean specify(CustomArray array){
        return array.isEmpty();
    }
}
