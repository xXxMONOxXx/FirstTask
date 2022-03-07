package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArrayFind {

    public int findMaxElement(CustomArray entity) throws CustomArrayException;

    public int findMinElement(CustomArray entity) throws CustomArrayException;
}
