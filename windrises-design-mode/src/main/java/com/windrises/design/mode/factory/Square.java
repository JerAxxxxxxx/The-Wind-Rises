package com.windrises.design.mode.factory;

/**
 * 正方形
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:48
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
