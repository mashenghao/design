package AsimpleFactory;

/**
 * 抽象产品接口：
 *
 * 负责暴露给用户实例的接口
 */
public abstract class Operation {

    protected int num1;
    protected int num2;

    //抽象方法；具体的实现让子类实现，这里提供一个统一的接口
    public abstract int operation();

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
