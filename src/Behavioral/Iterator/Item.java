/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

public class Item implements ItemInterface{

    private String name;
    private int    price;
    private String description;

    public Item(String name, int price, String description) {
        this.name        = name;
        this.price       = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
