package by.mishastoma.customarray.parse.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.parse.CustomArrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParserImpl implements CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();

    private static final String SPLIT_SIGN = ";";

    private static final String EMPTY_STRING = "";

    private static final String REGEX_SPACE_AND_END_OF_LINE = "\\s+";

    public CustomArray parse(String data) throws CustomArrayException {
        data.replaceAll(REGEX_SPACE_AND_END_OF_LINE,EMPTY_STRING);
        String[] numbers = data.split(SPLIT_SIGN);
        try {
            int[] array = new int[numbers.length];
            int arrayLength = array.length;
            for (int i = 0; i < arrayLength; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            return new CustomArray(array);
        } catch (Exception e) {
            logger.error("Cannot parse string: {}", data);
            throw new CustomArrayException("Cannot parse string " + data);
        }
    }
}
