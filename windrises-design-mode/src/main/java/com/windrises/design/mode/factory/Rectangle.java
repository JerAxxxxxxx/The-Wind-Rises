package com.windrises.design.mode.factory;

/**
 * 矩形
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:47
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
