package com.study.designpattern.simuduck.action;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

}
