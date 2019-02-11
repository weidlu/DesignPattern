package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:48
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
