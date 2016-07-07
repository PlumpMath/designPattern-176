package com.strategyPattern.fly;

import com.strategyPattern.FlyBehavior;

/**
 * Created by Administrator on 2016/7/7.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
