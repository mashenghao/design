package BfactoryMethod;

//苹果具体工厂
public class AppleFactory extends Factory {

    //返回一个具体的苹果产品
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
