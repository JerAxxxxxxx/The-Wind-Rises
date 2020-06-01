package com.windrises.design.mode.strategy;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 15:17
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
