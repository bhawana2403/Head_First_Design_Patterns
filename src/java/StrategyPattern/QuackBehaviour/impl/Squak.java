package StrategyPattern.QuackBehaviour.impl;

import StrategyPattern.QuackBehaviour.QuackBehaviour;

public class Squak implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
