package creational.factoryMethod;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by lomak on 22.11.2016.
 */
public class FileReportImpl implements ReportingLog {

    boolean reportingProcess;

        PrintWriter writer;

    public FileReportImpl() throws FileNotFoundException, UnsupportedEncodingException {

           writer = new PrintWriter("log.txt", "UTF-8");

    }

    @Override
    public void setReportingProcess(boolean reportingProcess) {
    this.reportingProcess = reportingProcess;
    }

    @Override
    public void safeReport(String report) {
    if(reportingProcess)
    {
        writer.println("Reporting:" + report);
        writer.flush();
    }
    }

    @Override
    public void printReport(String message) {
        writer.println("Error:" + message);
        writer.flush();
    }
}
