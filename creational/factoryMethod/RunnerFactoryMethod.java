package creational.factoryMethod;

/**
 * Created by lomak on 22.11.2016.
 */
public class RunnerFactoryMethod {
    public static void main(String[] args) {
       ReportingLog log = new  ReportingFactory().getReport();
        log.setReportingProcess(true);
        log.safeReport(" Windows error");
    }
}
