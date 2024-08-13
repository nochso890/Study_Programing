package com.study.designpattern.simuduck.action;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Beep Beep");
    }

}
