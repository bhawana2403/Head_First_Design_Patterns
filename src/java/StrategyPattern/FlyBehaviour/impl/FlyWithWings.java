package StrategyPattern.FlyBehaviour.impl;

import StrategyPattern.FlyBehaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I am flying with wings");
  }
}
