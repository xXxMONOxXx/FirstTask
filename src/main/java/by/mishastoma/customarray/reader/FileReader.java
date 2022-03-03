package by.mishastoma.customarray.reader;

import by.mishastoma.customarray.exception.FileException;

public interface FileReader {

    public String readFromFile(String fileName) throws FileException;
}
