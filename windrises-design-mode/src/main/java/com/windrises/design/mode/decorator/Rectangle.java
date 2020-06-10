package com.windrises.design.mode.decorator;

/**
 * 矩形长方形
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 10:52
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
