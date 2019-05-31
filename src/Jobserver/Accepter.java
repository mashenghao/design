package Jobserver;


import java.util.Observable;
import java.util.Observer;

/**
 * 接受者（观察者）
 * 需要实现Observer接口，定义统一的调用接口
 */
public class Accepter implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.toString() + "----状态改变，关联对象刷新状态");
    }
}
