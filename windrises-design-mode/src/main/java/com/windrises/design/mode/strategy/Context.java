package com.windrises.design.mode.strategy;

/**
 * 上下文
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 15:19
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
