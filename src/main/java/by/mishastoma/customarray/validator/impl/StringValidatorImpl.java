package by.mishastoma.customarray.validator.impl;

import by.mishastoma.customarray.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class StringValidatorImpl implements StringValidator {

    private static final Logger logger = LogManager.getLogger();

    private static final String REGEX_VALID_STRING = "(-?)\\d+((\\s?)+;(\\s?)+(-?)\\d+(\\s?)+)+((\\s?)+;(\\s?)+(-?)\\d+)";
    public boolean isValid(String data){
        if(data==null){
            return false;
        }
        else{
            if(data.length()==0){
                return true;
            }
            else{
                return Pattern.matches(REGEX_VALID_STRING, data);
            }
        }
    }
}
