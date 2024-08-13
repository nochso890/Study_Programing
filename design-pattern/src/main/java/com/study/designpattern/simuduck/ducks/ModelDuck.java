package com.study.designpattern.simuduck.ducks;

import com.study.designpattern.simuduck.action.FlyNoWay;
import com.study.designpattern.simuduck.action.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
