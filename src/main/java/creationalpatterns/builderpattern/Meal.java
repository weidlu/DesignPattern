package creationalpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wdlu
 * @create 2019-02-11 18:52
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
