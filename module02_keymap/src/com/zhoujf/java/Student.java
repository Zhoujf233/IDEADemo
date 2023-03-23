package com.zhoujf.java;

/**
 * ClassName: Student
 * Package: com.zhoujf.java
 * Description:
 *
 * @Author: ZhouJF
 * @Create: 2023/2/14 - 9:45 PM
 */
public class Student extends Person implements Comparable,Runnable{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
