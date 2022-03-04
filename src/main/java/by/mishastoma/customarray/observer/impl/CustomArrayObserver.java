package by.mishastoma.customarray.observer.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.entity.Warehouse;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.observer.CustomArrayEvent;
import by.mishastoma.customarray.observer.Observer;
import by.mishastoma.customarray.service.CustomArrayService;
import by.mishastoma.customarray.service.impl.CustomArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserver implements Observer {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(CustomArrayEvent event) {
        CustomArrayService service = new CustomArrayServiceImpl();
        CustomArray source = event.getSource();
        double average;
        int sum, max, min;
        try {
            average = service.calculateAverage(source);
            sum = service.calculateSum(source);
            max = service.findMaxElement(source);
            min = service.findMinElement(source);
        } catch (CustomArrayException e) {
            logger.warn(e.getMessage());
            return;
        }
        int id = source.getId();
        Warehouse warehouse = Warehouse.getInstance();
        try {
            warehouse.updateParameters(id, average, sum, max, min);
        } catch (CustomArrayException e) {
            logger.warn(e.getMessage());
        }
    }

}
