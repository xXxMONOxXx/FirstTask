package by.mishastoma.customarray.reader.impl;

import by.mishastoma.customarray.exception.FileException;
import by.mishastoma.customarray.reader.FileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {

    private static final char END_OF_LINE = '\n';
    private static final Logger logger = LogManager.getLogger();

    @Override
    public String readFromFile(String filePath) throws FileException {
        File file = new File(Paths.get(filePath).toUri());
        if(!file.exists()){
            logger.error("File {} not found", filePath);
            throw new FileException(String.format("File %s not found", filePath));
        }
        else{
            if(!file.canRead()){
                logger.error("File {} cannot be opened", filePath);
                throw new FileException(String.format("Can't open file %s", filePath));
            }
            else{
                try {
                    StringBuilder data = new StringBuilder();
                    Scanner reader = new Scanner(file);
                    while(reader.hasNextLine()){
                        String nextLine = reader.nextLine();
                        data.append(nextLine);
                        data.append(END_OF_LINE);
                    }
                    if(data.length()>0) {
                        data.deleteCharAt(data.length() - 1);
                    }
                    reader.close();
                    logger.info("Successfully got data from file {}", filePath);
                    return data.toString();
                }
                catch (Exception e){
                    logger.fatal("Unknown error with file {}", filePath);
                    e.printStackTrace();
                    throw new FileException(String.format("Unknown error with file %s", filePath));
                }
            }
        }
    }
}
