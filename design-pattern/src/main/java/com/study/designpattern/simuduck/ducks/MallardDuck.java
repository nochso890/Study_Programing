package com.study.designpattern.simuduck.ducks;

import com.study.designpattern.simuduck.action.FlyRocketPowered;
import com.study.designpattern.simuduck.action.FlyWithWings;
import com.study.designpattern.simuduck.action.Quack;

public class MallardDuck extends Duck{

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a mallard duck");
    }

    public void quack(){
        System.out.println("Quack~ Quack Quack~");
    }

    public void fly(){
        flyBehavior.fly();
    }
}
