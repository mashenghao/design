package AsimpleFactory;


/**
 * 创建型模式：
 * <p>
 * 在设计模式中，一共三种模式，创建型模式是将类的实例对象创建与实例
 * 使用分离出来，使代码结构更加清晰，只需要关注如何使用对象，好处是
 * 系统设计符合单一职责原则。隐藏了实例的创建细节，使复杂的对象实例
 * 过程与系统独立开来。
 */

/**
 * 简单工厂模式：
 * <p>
 * 模式：创建型模式
 * <p>
 * 介绍： 简单工厂设计模式（静态工厂方法 Static Factory Method）是将实例的
 * 创建统一到一个实例工厂中，根据消费者给定的信息，创建不同的实例。实例
 * 工厂中，有着实例的创建的逻辑与其他实例组合，这些无需外界了解。通常这些
 * 实例都具有同一个父类。
 * <p>
 * 组成：
 *   实例工厂：负责所有实例的创建逻辑，被外界直接调用
 *   抽象父类：工厂创建的实例的公有父类，负责描述实例对象的接口
 *   抽象产品：各个实例的统一接口
 *   具体产品（Concreate product）：单个实例的创建者，继承了抽象父类，由工厂调用
 *     完成一个实例的创建。
 * <p>
 * 图示：
 *  如图
 * <p>
 * 优点：
 *   工厂是整个模式的核心，他包含实例的创建逻辑，根据外界给定的信息，输出具体的
 *   实例对象。用户直接使用工厂创建的实例对象，不需要关注内部使用，从而将对象创建
 *   与软件逻辑隔离，软件结构更加清晰。
 * <p>
 * 缺点：
 *   扩展性不好，每次扩展新的实例，都需要更改工厂代码。
 *   所有实例创建逻辑都集中在工厂中，工厂庞大，不符合高内聚原则。
 *
 * 案例：
 *  不同数据库连接对象，计算器操作符
 */
public class MainClass {

    //案例： 计算器操作对象创建
    public static void main(String[] args) {
        int num1 =6;
        int num2 = 3;

        //进行加法计算
        //  >> 1.获取加法操作的实例对象
        Operation addOperation = OperationFactory.createOperation("+");
        //  >>2.进行赋值，并运算
        addOperation.setNum1(num1);
        addOperation.setNum2(num2);
        int result = addOperation.operation();
        System.out.println("加法结果： "+result);//9

        //进行乘法计算
        //  >> 1.获取乘法操作的实例对象
        Operation mulOperation = OperationFactory.createOperation("*");
        //  >>2.进行赋值，并运算
        mulOperation.setNum1(num1);
        mulOperation.setNum2(num2);
        int result2 = mulOperation.operation();
        System.out.println("乘法结果： "+result2);//18

    }

}
