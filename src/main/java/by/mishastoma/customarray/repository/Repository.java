package by.mishastoma.customarray.repository;

public class Repository {
    //// TODO: 01.03.2022

    private static Repository instance;

    private Repository(){

    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }
}
