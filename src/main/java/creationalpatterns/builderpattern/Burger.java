package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:41
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * price of this burger item.
     * @return price
     */
    @Override
    public abstract float price();
}
