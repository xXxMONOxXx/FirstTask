package by.mishastoma.customarray.entity;

import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.observer.CustomArrayEvent;
import by.mishastoma.customarray.observer.Observable;
import by.mishastoma.customarray.observer.Observer;
import by.mishastoma.customarray.util.CustomId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CustomArray implements Observable {

    private final int id;
    private int[] array;
    private ArrayList <Observer> observers = new ArrayList<Observer>();

    public CustomArray(int... customArray) {

        this.id = CustomId.generate();
        this.array = customArray;
        notifyObservers();

    }

    public int getId() {

        return id;
    }

    public int[] getArray() {

        return array.clone();
    }

    public void setArray(int... customArray) {

        this.array = customArray;
        notifyObservers();
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

    public boolean isEmpty(){
        return this.array==null || array.length==0;
    }

    public void setElement(int index, int value) throws CustomArrayException {
        if (index < 0 || index >= array.length) {
            throw new CustomArrayException(String.format("Index %d is out of range.", index));
        } else {
            array[index] = value;
            notifyObservers();
        }

    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "id=" + id +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray array1 = (CustomArray) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, observers);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        for(Observer observer : observers){
            observer.parameterChanged(event);
        }
    }

    @Override
    public void attach(Observer observer) {
        if(observer != null && !observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if(observer != null){
            observers.remove(observer);
        }
    }
}
