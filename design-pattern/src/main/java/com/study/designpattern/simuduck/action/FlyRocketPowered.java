package com.study.designpattern.simuduck.action;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }

}
