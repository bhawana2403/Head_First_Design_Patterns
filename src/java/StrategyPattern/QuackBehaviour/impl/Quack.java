package StrategyPattern.QuackBehaviour.impl;

import StrategyPattern.QuackBehaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("Quack");

  }
}
