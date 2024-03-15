package StrategyPattern.Duck.DuckType;

import StrategyPattern.Duck.Duck;
import StrategyPattern.FlyBehaviour.impl.FlyWithWings;
import StrategyPattern.QuackBehaviour.impl.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehaviour = new Quack(); // it is allowing the quack class implementation to handle quack for it
    flyBehaviour = new FlyWithWings(); // it is allowing fly with wings to handle fly behaviour for it
  }

  public void display(){
    System.out.println("I'm a real Mallard duck");
  }
}
