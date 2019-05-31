package Jobserver;

import java.util.Observer;

/**
 * 观察者模式：
 * <p>
 * 模式：行为模式
 * <p>
 * 介绍：
 * 观察者模式是行为模式，是将一个对象与其其他对象进行关联，当对象发生改变时
 * 通知关联对象发生状态改变，自动刷新状态。这个模式作用是一种同步通信的手段，
 * 是对象与雨来对象保持同步。
 * <p>
 * 组成：
 * subject被观察对象：
 * 被观察的对象。当需要被观察的状态发生变化时，
 * 需要通知队列中所有观察者对象。Subject需要维持（添加，删除，通知）一个观察者对象的队列列表
 * concreateSubject 具体观察者：
 * Observer被观察者：
 * ConcreateObserver被观察者的具体实现：
 * <p>
 * 图示：
 *
 * <p>
 * 优缺点：
 * <p>
 * 案例：
 * 侦听事件驱动程序设计中的外部事件
 * 侦听/监视某个对象的状态变化
 * 发布者/订阅者(publisher/subscriber)模型中，当一个外部事件（新的产品，消息的出现等等）
 * 被触发时，通知邮件列表中的订阅者
 */
public class MainClass {

    //使用jdk提供的工具类Observer，模拟发送订阅通知
    public static void main(String[] args) {

        Pusher pusher = new Pusher();
        //添加观察者
        pusher.addObserver(new Accepter());
        pusher.addObserver(new Accepter());
        pusher.addObserver(new Accepter());
        //发送最新推送消息
        pusher.putNews();

    }

}
