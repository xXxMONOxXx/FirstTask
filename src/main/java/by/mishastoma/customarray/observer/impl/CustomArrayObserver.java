package by.mishastoma.customarray.observer.impl;

import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.entity.Warehouse;
import by.mishastoma.customarray.exception.CustomArrayException;
import by.mishastoma.customarray.observer.CustomArrayEvent;
import by.mishastoma.customarray.observer.Observer;
import by.mishastoma.customarray.service.CustomArrayCalculate;
import by.mishastoma.customarray.service.CustomArrayFind;
import by.mishastoma.customarray.service.impl.CustomArrayCalculateImpl;
import by.mishastoma.customarray.service.impl.CustomArrayFindImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserver implements Observer {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(CustomArrayEvent event) {
        CustomArrayCalculate calculateService = new CustomArrayCalculateImpl();
        CustomArrayFind findService = new CustomArrayFindImpl();
        CustomArray source = event.getSource();
        double average;
        int sum, max, min;
        try {
            average = calculateService.calculateAverage(source);
            sum = calculateService.calculateSum(source);
            max = findService.findMaxElement(source);
            min = findService.findMinElement(source);
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
