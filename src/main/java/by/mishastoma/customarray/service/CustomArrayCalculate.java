package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArrayCalculate {

    public double calculateAverage(CustomArray entity) throws CustomArrayException;

    public int calculateSum(CustomArray entity) throws CustomArrayException;

    public int calculateNumberOfPositiveElements(CustomArray entity) throws CustomArrayException;

    public int calculateNumberOfNegativeElements(CustomArray entity) throws CustomArrayException;
}
