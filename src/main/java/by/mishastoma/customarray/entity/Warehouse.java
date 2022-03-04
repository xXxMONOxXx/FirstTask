package by.mishastoma.customarray.entity;

import by.mishastoma.customarray.exception.CustomArrayException;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private final Map<Integer, CustomArrayParameter> arrayParameterMap;
    private static Warehouse instance;

    private Warehouse(){
        arrayParameterMap = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public void putParameters(int id, double average, int sum, int max, int min){
        CustomArrayParameter parameter = new CustomArrayParameter();
        parameter.setAverage(average);
        parameter.setSum(sum);
        parameter.setMax(max);
        parameter.setMin(min);
        arrayParameterMap.put(id, parameter);
    }

    public CustomArrayParameter getParameters(int id) throws CustomArrayException {
        CustomArrayParameter parameter = arrayParameterMap.get(id);
        if(parameter == null){
            throw new CustomArrayException(String.format("CustomArrayParameter with id %d not found.", id));
        }
        else{
            return parameter;
        }
    }

    public void updateParameters(int id, double average, int sum, int max, int min) throws CustomArrayException{
        CustomArrayParameter parameter = arrayParameterMap.get(id);
        if(parameter == null){
            throw new CustomArrayException(String.format("No such element with id %d in warehouse", id));
        }
        else{
            parameter.setAverage(average);
            parameter.setSum(sum);
            parameter.setMax(max);
            parameter.setMin(min);
        }
    }

    public boolean containsKey(int key){
        return arrayParameterMap.containsKey(key);
    }
}
