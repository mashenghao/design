package AsimpleFactory;

/**
 * 工厂角色：
 * 模式的核心，负责所有实例的逻辑创建
 */
public class OperationFactory {

    //这是为静态方法，直接类名点方法调用
    public static Operation createOperation(String type){
        //java中switch支持switch中使用String类型的key，具体原因： 查询switch语法糖
        switch (type){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                throw new RuntimeException("不支持操作");
        }

    }
}
