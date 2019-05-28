package BfactoryMethod;

/**
 * @program: DesignPattern
 * @Date: 2019/5/29 0:01
 * @Author: mahao
 * @Description:
 */
public class PearFactory extends Factory {

    //返回一个梨子的实例
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
