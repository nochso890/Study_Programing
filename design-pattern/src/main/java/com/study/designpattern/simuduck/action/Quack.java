package com.study.designpattern.simuduck.action;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
