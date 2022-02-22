package by.mishastoma.customarray.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    private static final char SPACE = ' ';

    public CustomArray(int... customArray) {

        this.array = customArray;
    }

    public int[] getArray() {

        return array.clone();
    }

    public void setArray(int[] customArray) {
        this.array = customArray;
    }

    public boolean isEmpty() {
        return array == null;
    }

    public int length() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int element : array){
            stringBuilder.append(element + SPACE);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
