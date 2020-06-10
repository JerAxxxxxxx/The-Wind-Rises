package com.windrises.design.mode.chainofresponsibility;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 14:07
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
