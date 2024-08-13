package com.study.designpattern.simuduck.action;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I don't flying");
    }
}
