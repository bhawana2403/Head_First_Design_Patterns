package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.DuckType.MallardDuck;

public class Main {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    System.out.println("Hello world!");
  }
}
