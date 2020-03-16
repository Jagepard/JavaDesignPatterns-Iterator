/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.List;

public interface ClientInterface {

    List<ItemInterface> getBucket();
    void addItemToTheBucket(ItemInterface item);
}
