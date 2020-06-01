package com.windrises.design.mode.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:35
 */
public class Observer1 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MySubject) {
            MySubject subjectFor3d = (MySubject) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
