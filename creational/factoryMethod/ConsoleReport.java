package creational.factoryMethod;

/**
 * Created by lomak on 22.11.2016.
 */
public class ConsoleReport implements  ReportingLog {

    boolean reportingProcess;
    @Override
    public void setReportingProcess(boolean reportingProcess) {
        this.reportingProcess = reportingProcess;
    }

    @Override
    public void safeReport(String report) {
if(reportingProcess)
{
    System.out.println("Reporting" + report);
}
    }

    @Override
    public void printReport(String message) {
        System.out.println("Error" + message);
    }
}
