package by.mishastoma.customarray.validator.impl;

import by.mishastoma.customarray.validator.StringValidator;

import java.util.regex.Pattern;

public class StringValidatorImpl implements StringValidator {

    private static final String REGEX_VALID_INT_ARRAY = "^\\s*(-?)\\d+\\s*(;\\s*(-?)\\d+\\s*)*$";

    @Override
    public boolean isValidIntArray(String data){
        if(data==null){
            return false;
        }
        else{
            if(data.length()==0){
                return true;
            }
            else{
                return Pattern.matches(REGEX_VALID_INT_ARRAY, data);
            }
        }
    }
}