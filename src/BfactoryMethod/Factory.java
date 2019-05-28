package BfactoryMethod;

/**
 * 抽象工厂，所有具体工厂必须实现，可以是接口
 */
public  abstract class Factory {

    //定义所有具体工厂的功能
    public abstract Fruit getFruit();
}
