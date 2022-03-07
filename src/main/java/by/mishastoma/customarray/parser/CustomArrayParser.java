package by.mishastoma.customarray.parser;

import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArrayParser {

    public int[] parse(String data) throws CustomArrayException;
}
