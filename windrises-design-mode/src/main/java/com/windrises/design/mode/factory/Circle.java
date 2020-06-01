package com.windrises.design.mode.factory;

/**
 * 圆形
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:48
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
