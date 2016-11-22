package creational.factoryMethod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by lomak on 22.11.2016.
 */
public class ReportingFactory {
    public static ReportingLog getReport() {
        try {
            return new FileReportImpl();
        } catch (IOException ex) {
            ReportingLog reportingLog = new ConsoleReport();
            reportingLog.printReport("Could not write to file");
            return reportingLog;
        }
    }
}
