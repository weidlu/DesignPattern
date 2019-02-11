package creationalpatterns.builderpattern;

/**
 * @author wdlu
 * @create 2019-02-11 18:36
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
