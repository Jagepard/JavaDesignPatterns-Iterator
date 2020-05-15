/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client implements ClientInterface {

    private final List<ItemInterface> bucket = new ArrayList<>();

    @Override
    public List<ItemInterface> getBucket() {
        return this.bucket;
    }

    @Override
    public void addItemToTheBucket(ItemInterface item){
        this.bucket.add(item);
    }
}
