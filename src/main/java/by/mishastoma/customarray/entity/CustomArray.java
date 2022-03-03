package by.mishastoma.customarray.entity;

import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.util.CustomId;

import java.util.Arrays;

public class CustomArray {

    private final int id;

    private int[] array;

    private static final char SPACE = ' ';
    public CustomArray(int... customArray) {

        this.id = CustomId.generate();
        this.array = customArray;

    }

    public int getId() {

        return id;
    }

    public int[] getArray() {

        return array.clone();
    }

    public void setArray(int... customArray) {

        this.array = customArray;
    }

    public int length() {

        return array.length;
    }

    public int getElement(int index) throws CustomArrayException {
        if (index < 0 || index >= array.length) {
            throw new CustomArrayException(String.format("Index %d is out of range.", index));
        } else {
            return array[index];
        }

    }

    public void setElement(int index, int value) throws CustomArrayException {
        if (index < 0 || index >= array.length) {
            throw new CustomArrayException(String.format("Index %d is out of range.", index));
        } else {
            array[index] = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element + SPACE);
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
