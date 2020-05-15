/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

public class Main {

    public static void main(String[] args) {

        ClientInterface client = new Client();

        client.addItemToTheBucket(new Item("Tights", 150, "darned"));
        client.addItemToTheBucket(new Item("Meat", 250, "rotten"));
        client.addItemToTheBucket(new Item("Bread", 40, ""));

        IteratorInterface employee = new Iterator(client.getBucket());

        try {
            System.out.println(employee.iterateItems());
        } catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}
