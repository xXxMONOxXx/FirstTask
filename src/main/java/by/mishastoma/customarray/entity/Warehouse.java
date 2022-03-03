package by.mishastoma.customarray.entity;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Warehouse {

    private OptionalDouble average;
    private OptionalInt sum;
    private OptionalInt max;
    private OptionalInt min;
    //// TODO: 01.03.2022
    private static Warehouse instance;

    private Warehouse(){

    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }
}
