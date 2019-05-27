package AsimpleFactory;

/**
 * Concreate product:具体产品
 *
 * 由工厂调用，完成具体实例的创建
 *
 */
public class OperationAdd extends Operation {
    @Override
    public int operation() {
        return num1+num2;
    }
}
