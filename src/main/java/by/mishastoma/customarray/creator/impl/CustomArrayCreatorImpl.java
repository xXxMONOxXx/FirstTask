package by.mishastoma.customarray.creator.impl;

import by.mishastoma.customarray.creator.CustomArrayCreator;
import by.mishastoma.customarray.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCreatorImpl implements CustomArrayCreator {

    private static final Logger logger = LogManager.getLogger();

    public static CustomArray createCustomArray(){
        return new CustomArray(); //// TODO: 04.03.2022
    }
}
