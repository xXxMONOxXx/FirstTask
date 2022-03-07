package by.mishastoma.customarray.creator.impl;

import by.mishastoma.customarray.creator.CustomArrayCreator;
import by.mishastoma.customarray.entity.CustomArray;

public class CustomArrayCreatorImpl implements CustomArrayCreator {

    public CustomArray createCustomArray(int... array) {

        return new CustomArray(array);
    }
}
