package com.study.designpattern.simuduck.ducks;

import com.study.designpattern.simuduck.action.FlyBehavior;
import com.study.designpattern.simuduck.action.QuackBehavior;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void performQuack() {
      quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
