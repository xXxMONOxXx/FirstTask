package test.mishastoma.customarray.validator.impl;

import by.mishastoma.customarray.validator.StringValidator;
import by.mishastoma.customarray.validator.impl.StringValidatorImpl;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StringValidatorTest {

    private final StringValidator validator = new StringValidatorImpl();

    @Test
    public void invalidStringMissingNumberTest(){
        boolean actual = validator.isValidIntArray("12 ; 12312 ;; 123123");
        Assert.assertFalse(actual);
    }

    @Test
    public void invalidStringInvalidCharacterTest(){
        boolean actual = validator.isValidIntArray("12 ; 1231x2 ; 123123");
        Assert.assertFalse(actual);
    }

    @Test
    public void validStringTest(){
        boolean actual = validator.isValidIntArray("123   ;   123   ; 55 ;   -3 ; 20");
        Assert.assertTrue(actual);
    }
}
