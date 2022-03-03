package by.mishastoma.customarray.util;

public class CustomId {

    private static int nextIdValue = 0;

    private static CustomId instance;

    private CustomId(){

    }

    public static CustomId getInstance(){
        if(instance == null){
            instance = new CustomId();
        }
        return instance;
    }

    public static int generate(){
        return ++nextIdValue;
    }
}
