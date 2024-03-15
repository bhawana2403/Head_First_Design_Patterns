package StrategyPattern.Duck;

import StrategyPattern.FlyBehaviour.FlyBehaviour;
import StrategyPattern.QuackBehaviour.QuackBehaviour;


// duck just allows the object that is referenced to quack for it
public class Duck {

  // instance variable hold a specific behaviour at runtime
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;
    // it will delegate to quack()
    public void performQuack(){
      quackBehaviour.quack();
    }
    public void swim(){}
    public void display(){}
  // it will delegate to fly()
    public void performFly(){
      flyBehaviour.fly();
    }

    // adding to new methods
  /* using these methods we can set the behaviours on the fly */

  public void setFlyBehaviour(FlyBehaviour fb){
      flyBehaviour = fb;
  }
  public void setQuackBehaviour(QuackBehaviour qb){
      quackBehaviour = qb;
  }
}
