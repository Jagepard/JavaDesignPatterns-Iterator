/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

public class Main {

    public static void main(String[] args) {

        ClientInterface client = new Client();

        client.addItemToTheBucket(new Item("Колготки", 150, "штопаные"));
        client.addItemToTheBucket(new Item("Мясо", 250, "тухлое"));
        client.addItemToTheBucket(new Item("Батон", 40, ""));

        IteratorInterface employee = new Iterator(client.getBucket());

        try {
            employee.iterateItems();
        } catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}
