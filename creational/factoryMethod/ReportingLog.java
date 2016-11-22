package creational.factoryMethod;

/**
 * Created by lomak on 22.11.2016.
 */
public interface ReportingLog {

    void setReportingProcess(boolean reportingProcess);

    void safeReport(String report);

    void printReport(String message);
}
