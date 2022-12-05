package com.windrises.system.event;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

/**
 * @author Liuhaozhen
 * @date 2022-12-05 15:06:00
 */
public class TestOneEvent extends ApplicationEvent {

    private String message;

    public TestOneEvent(Object source) {
        super(source);
    }


    public TestOneEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
