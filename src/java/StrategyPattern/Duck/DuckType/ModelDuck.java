package StrategyPattern.Duck.DuckType;

import StrategyPattern.Duck.Duck;
import StrategyPattern.FlyBehaviour.impl.FlyNoWay;
import StrategyPattern.QuackBehaviour.impl.Quack;

public class ModelDuck extends Duck {
  public ModelDuck(){
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Quack();
  }
  public void display(){
    System.out.println("I'm in a model class");
  }



}
