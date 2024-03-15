package StrategyPattern.QuackBehaviour.impl;

import StrategyPattern.QuackBehaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("<< Silence >>x");

  }
}
