package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArraySort {

    public void bubbleSort(CustomArray entity) throws CustomArrayException;

    public void selectionSort(CustomArray entity) throws CustomArrayException;

    public void gnomeSort(CustomArray entity) throws CustomArrayException;
}
