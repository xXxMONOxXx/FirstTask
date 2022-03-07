package by.mishastoma.customarray.parser;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArrayParser {

    public CustomArray parse(String data) throws CustomArrayException;
}
