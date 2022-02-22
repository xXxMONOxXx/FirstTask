package by.mishastoma.customarray.service;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;

public interface CustomArraySort {

    public void BubbleSort(CustomArray entity) throws CustomArrayException;

    public void SelectionSort(CustomArray entity) throws CustomArrayException;

    public void GnomeSort(CustomArray entity) throws CustomArrayException;
}
