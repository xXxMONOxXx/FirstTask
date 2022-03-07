package by.mishastoma.customarray.main;

import by.mishastoma.customarray.exception.FileException;
import by.mishastoma.customarray.reader.FileReader;
import by.mishastoma.customarray.reader.impl.FileReaderImpl;

public class Main {

    public static void main(String[] args) {
        FileReader reader = new FileReaderImpl();
        try {
            String actual = reader.readFromFile("src/main/resources/data/data.txt");
        }
        catch (FileException e){
            System.out.println(e.getMessage());
        }
    }
}
