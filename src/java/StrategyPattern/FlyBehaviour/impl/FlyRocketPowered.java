package StrategyPattern.FlyBehaviour.impl;

import StrategyPattern.FlyBehaviour.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

  @Override
  public void fly() {
      System.out.println("I'm in a flying rocket!");
  }
}
