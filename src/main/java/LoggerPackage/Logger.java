/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoggerPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rex Burkybile
 */
public class Logger {
    public class ConsoleLogger {
    private String context;
    
    public ConsoleLogger(String context) {
        this.context = context;
    }
    
    public void LogData(String logData) {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("info:\t["+time+"]("+this.context+") - "+ logData);
    } 
}
}
