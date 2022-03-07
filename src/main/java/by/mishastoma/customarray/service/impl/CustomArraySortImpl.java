package by.mishastoma.customarray.service.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.service.CustomArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySortImpl implements CustomArraySort {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void bubbleSort(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null || entity.length()==0) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int arrayLength = array.length;
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayLength; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            logger.info("Bubble sort finished. Sorted array is: {}", array);
            entity.setArray(array);
        }
    }

    @Override
    public void selectionSort(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null || entity.length()==0) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int arrayLength = array.length;
            int iBound = arrayLength - 1;
            for (int i = 0; i < iBound; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arrayLength; j++) {
                    if (array[minIndex] > array[j]) {
                        minIndex = j;
                    }
                }
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            logger.info("Selection sort finished. Sorted array is: {}", array);
            entity.setArray(array);
        }
    }

    @Override
    public void gnomeSort(CustomArray entity) throws CustomArrayException {
        if (entity == null || entity.getArray() == null || entity.length()==0) {
            logger.error("Empty array exception");
            throw new CustomArrayException("Empty array exception");
        } else {
            int[] array = entity.getArray();
            int index = 0;
            int arrayLength = array.length;
            while (index < arrayLength) {
                if (index == 0) {
                    index++;
                }
                if (array[index] >= array[index - 1]) {
                    index++;
                } else {
                    int temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                    index--;
                }
            }
            logger.info("Gnome sort finished. Sorted array is: {}", array);
            entity.setArray(array);
        }
    }
}
