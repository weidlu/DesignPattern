package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:50
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
