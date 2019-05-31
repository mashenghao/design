package Jobserver;

import java.util.Observable;

/**
 * 信息推送者，（被观察者）
 */
public class Pusher extends Observable {


    //推送者发送新的信息
    public void putNews(){

        System.out.println("写了一个新的段子，我要发送给我的关注粉丝");

        //状态改变
        this.setChanged();
        //通知观察者更新状态
        this.notifyObservers();
    }

}
