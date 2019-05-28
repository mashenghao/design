package BfactoryMethod;

/**
 * 工厂方法模式：
 * <p>
 * 模式： 创建型模式
 * <p>
 * 介绍：工厂方法模式的出现是为了解决简单工厂模式的不足，简单工厂对于新增的具体产品，每增加
 * 一个产品，都需要更改一次工厂类，这个扩展性不好。工厂方法模式是将每个产品的创建都设置为一个工厂，
 * 这些具体工厂有一个共同的父类。工厂将具体的对象创建推迟到子类（具体工厂）来实现，因此这个又叫
 * 做多态工厂。每次新增加一个新的产品，需要增加一个产品类，和一个产品构造工厂，不要更改其他地方代码。
 * <p>
 * 组成：
 * 抽象工厂：负责描述所有具体工厂共有的接口，所有工厂必须实现这个方法
 * 具体工厂：具体工厂类是抽象工厂的一个实现，负责实例化产品对象。
 * 抽象角色：工厂方法模式所创建的所有对象的父类，负责描述所有产品共有的公共接口
 * 具体产品: 产出对象
 * <p>
 * 图示：
 * <p>
 * 优点：
 * 扩展性好，每次新增一个产品，只需要新增产品工厂实现抽象工厂的类和一个具体产品类，不需要在对以前的
 * 代码有任何改动。
 * <p>
 * 缺点：
 * 一个产品新增，需要添加两个类，增加系统复杂度。
 * <p>
 * 使用场景：
 *  1.一个类不知道它所需要的对象的类：
 *      在工厂方法模式下，客户端不需要知道他具体产品类的类型，只需要知道用哪个具体工厂进行创建
 *   客户端需要知道具体工厂类
 *  2.一个类通过其子类来指定创建哪个对象：
 *       符合多态特性，子类创建具体的实例，父类引用，这个引用的具体则有子类决定。工厂方法模式下，父类
 *       工厂提供接口，由具体产品工厂实现，在程序运行时，创建的对象则由子类决定。
 *  3.一个类中，不知道用哪中具体工厂：
 *      编译时无法确定使用哪个具体工厂，在运行时，根据条件，创建具体的工厂，这个工厂的类名可以存放到文件中
 *
 */
public class MainClass {

    public static void main(String[] args) throws Exception {

        //1.一个类不知道他所需要对象的类
        //不知道使用哪个实例，知道创建实例的具体工厂
        Fruit fruit = null;//未知
        Factory factory = new AppleFactory();
        fruit=factory.getFruit();
        fruit.getName();

        //2.一个类的产品可以通过工厂的子类决定
        Factory factory1 = new AppleFactory();
        Fruit f = factory1.getFruit();
        f.getName();
        factory1= new PearFactory();
        f= factory1.getFruit();
        f.getName();

        //3.动态指定工厂
        //根据传入的参数，创建不同产品
        Factory factory3= (Factory) Class.forName("BfactoryMethod.AppleFactory").newInstance();
        Fruit fruit3 = factory3.getFruit();
        fruit3.getName();


    }
}
