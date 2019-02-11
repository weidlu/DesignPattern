package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:39
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
