package com.windrises.design.mode.decorator;

/**
 * 圆形
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 10:53
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
