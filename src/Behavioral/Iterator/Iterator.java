/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.List;

public class Iterator implements IteratorInterface{

    private final List<ItemInterface> bucket;

    public Iterator(List<ItemInterface> bucket) {
        this.bucket = bucket;
    }

    @Override
    public String iterateItems() {
        StringBuilder output = new StringBuilder();

        for (ItemInterface item : bucket) {
            output.append(String.format("%s %s %s\n", item.getName(), item.getPrice(), item.getDescription()));
        }

        return output.toString();
    }
}
