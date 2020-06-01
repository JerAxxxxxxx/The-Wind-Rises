package com.windrises.design.mode.observer;

import java.util.Observable;

/**
 * 创建3D彩票主题
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:32
 */
public class MySubject extends Observable {
    private String msg;


    public String getMsg() {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

}
