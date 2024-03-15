package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.DuckType.MallardDuck;
import StrategyPattern.Duck.DuckType.ModelDuck;
import StrategyPattern.FlyBehaviour.impl.FlyRocketPowered;

public class MiniDuckSimulator {
  public static void main(String [] args){
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehaviour(new FlyRocketPowered());
    model.performFly();
  }

}
