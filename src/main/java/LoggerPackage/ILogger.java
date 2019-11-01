/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoggerPackage;

/**
 *
 * @author Rex Burkybile
 */
public interface ILogger {
    void LogData(String logData, String programLocation);
    void LogWarning(String logData, String programLocation);
    void LogError(String logData, String programLocation);
}
