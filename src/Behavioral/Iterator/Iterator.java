/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.List;

public class Iterator implements IteratorInterface{

    private List<ItemInterface> bucket;

    public Iterator(List<ItemInterface> bucket) {
        this.bucket = bucket;
    }

    @Override
    public void iterateItems() {
        for (ItemInterface item : bucket) {
            System.out.printf("%s Цена: %s у.е. %s \n", item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
