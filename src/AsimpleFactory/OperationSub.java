package AsimpleFactory;

/**
 * @program: DesignPattern
 * @Date: 2019/5/27 17:18
 * @Author: mahao
 * @Description:
 */
public class OperationSub extends Operation {
    @Override
    public int operation() {
        return num1-num2;
    }
}
