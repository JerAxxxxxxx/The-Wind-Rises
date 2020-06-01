package com.windrises.design.mode.factory;

/**
 * 工厂模式
 * 在工厂模式中，我们没有创建逻辑暴露给客户端创建对象，
 * 并使用一个通用的接口引用新创建的对象。
 * <p>
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:52
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }

}
