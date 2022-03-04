package by.mishastoma.customarray.observer;

import by.mishastoma.customarray.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

    public CustomArrayEvent (Object source){
        super(source);
    }

    @Override
    public CustomArray getSource(){
        return (CustomArray) super.getSource();
    }
}
