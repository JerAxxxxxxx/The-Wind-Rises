package com.windrises.design.mode.strategy;

/**
 * 策略模式demo
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 15:19
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
