package com.windrises.design.mode.decorator;

/**
 * 形状装饰器抽象类
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 10:53
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
