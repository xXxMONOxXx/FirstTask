import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.service.CustomArrayService;
import by.mishastoma.customarray.service.CustomArrayServiceImpl;
import by.mishastoma.customarray.service.CustomArraySort;
import by.mishastoma.customarray.service.CustomArraySortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        /*
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
        */
        int[] testArray = new int[]{ 0,5,3,4,5,11,7,8,-7,10 };
        CustomArray array = new CustomArray(testArray);
        CustomArrayService service = new CustomArrayServiceImpl();
        CustomArraySort sort = new CustomArraySortImpl();
        try {
            logger.info("Message");
            sort.GnomeSort(array);
            sort.BubbleSort(array);
            sort.SelectionSort(array);

            service.calculateAverage(array);
            service.calculateNumberOfNegativeElements(array);
            service.calculateNumberOfPositiveElements(array);
            service.calculateSum(array);
            service.findMaxElement(array);
            service.findMinElement(array);
            service.changeNegativeElementsToZero(array);
        }
        catch (Exception e){

        }

    }
}
