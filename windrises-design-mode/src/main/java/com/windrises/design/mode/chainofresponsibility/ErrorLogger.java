package com.windrises.design.mode.chainofresponsibility;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 14:08
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
