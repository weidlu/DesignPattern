package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:45
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * price of this cold drink item.
     * @return price
     */
    @Override
    public abstract float price();
}
