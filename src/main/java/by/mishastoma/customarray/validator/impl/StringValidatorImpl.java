package by.mishastoma.customarray.validator.impl;

import by.mishastoma.customarray.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidatorImpl implements StringValidator {

    private static final Logger logger = LogManager.getLogger();

    private static final String REGEX_LETTERS = "[a-zA-Z]+$";

    public boolean isValid(String data){
        return true;
    }
}
