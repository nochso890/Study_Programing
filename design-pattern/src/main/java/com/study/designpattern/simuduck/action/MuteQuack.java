package com.study.designpattern.simuduck.action;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println(".....");
    }

}
