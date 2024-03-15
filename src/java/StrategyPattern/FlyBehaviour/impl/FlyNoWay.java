package StrategyPattern.FlyBehaviour.impl;

import StrategyPattern.FlyBehaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I can't fly");

  }
}
