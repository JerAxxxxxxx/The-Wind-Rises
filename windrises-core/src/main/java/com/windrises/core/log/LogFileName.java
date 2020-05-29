package com.windrises.core.log;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/5/28 15:56
 */
public enum LogFileName {
    SYNC_LOG("syncLog"),
    BIZ_LOG("bizLog");

    private String logFileName;

    LogFileName(String fileName) {
        this.logFileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public static LogFileName getAwardTypeEnum(String value) {
        LogFileName[] arr = values();
        for (LogFileName item : arr) {
            if (null != item && !item.logFileName.equals("")) {
                return item;
            }
        }
        return null;
    }
}
