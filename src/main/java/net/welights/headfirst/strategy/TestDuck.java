package net.welights.headfirst.strategy;

import net.welights.headfirst.strategy.behaviorimpl.FlyRockedPowered;

/*
  为什么不在duck类中添加fly和quack接口
  飞和叫的方式 对所有鸭子而言不是相同的（是变化的）， 因此将他们提取出来，如果加在超类中可能导致子类具有了不适配的某些特征，比如橡胶鸭会飞

  为什么不用继承来提供duck的行为
  代码在子类中重复，运行时不容易改变，很难知道鸭子的所有行为，改动会造成其他子类不必要的改动，因为抽象类位于顶层

  duck对象不直接去执行飞或者叫，而是交由其他类（behavior）委托实现实现

  这样的设计可以让呱咕叫或者飞的行为被其它对象复用，因为这些行为已经与鸭子无关了，这样一来有了继承带来的复用的好处。却没有继承带来的包袱

  这就是策略模式

  定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 */

public class TestDuck {
    public static void main(String[] args) {
        Duck mallard  = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
