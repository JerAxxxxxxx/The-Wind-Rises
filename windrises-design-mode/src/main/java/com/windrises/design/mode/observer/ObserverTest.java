package com.windrises.design.mode.observer;

/**
 * 观察者模式
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 14:35
 */
public class ObserverTest {

    /**
     * 观察者模式是一种一对多的关系，对于setXXXListener是1对1的关系，应该叫回调
     *
     * @param args
     */
    public static void main(String[] args) {
        MySubject subjectFor3d = new MySubject();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);


        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }
}
