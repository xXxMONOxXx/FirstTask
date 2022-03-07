package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArrayChange {

    public void changeNegativeElementsToZero(CustomArray entity) throws CustomArrayException;

}
