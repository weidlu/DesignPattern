package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:49
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
