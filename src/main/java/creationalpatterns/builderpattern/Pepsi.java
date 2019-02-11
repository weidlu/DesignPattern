package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:51
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
