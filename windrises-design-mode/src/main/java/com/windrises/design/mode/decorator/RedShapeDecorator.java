package com.windrises.design.mode.decorator;

/**
 * 红色装饰器，重写draw方法，对方法进行增强
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/10 10:54
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red========" + decoratedShape);
    }
}
