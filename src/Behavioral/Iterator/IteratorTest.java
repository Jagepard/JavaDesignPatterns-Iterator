/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    private ClientInterface client;

    @BeforeEach
    void setUp() {
        this.client = new Client();
    }

    @Test
    void testAggregatesItems() {
        this.client.addItemToTheBucket(new Item("Tights", 150, "darned"));
        IteratorInterface employee = new Iterator(this.client.getBucket());

        assertEquals("Tights 150 darned\n", employee.iterateItems());
    }
}