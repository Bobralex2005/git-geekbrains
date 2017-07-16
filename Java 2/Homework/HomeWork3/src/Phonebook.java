import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Alexander Bugaev on 12.07.2017.
 */
public class Phonebook {

    /*Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот
    телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона
    по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда
    при запросе такой фамилии должны выводиться все телефоны. */

    private HashMap<String, HashSet<String>> hm = new HashMap<>();

    public Phonebook() {
        this.hm = new HashMap<>();
    }

    public void add(String name, String telNumber) {
        HashSet<String> hs = hm.getOrDefault(name, new HashSet<>());
        hs.add(telNumber);
        hm.put(name, hs);
    }

    public void get(String name) {
        if (hm.get(name) == null){
            System.out.println("Name not found");
        } else System.out.println(name + hm.get(name));
    }

    public static void main(String[] args) {
        Phonebook book = new Phonebook();

        book.add("Smith", "+1123489545");
        book.add("Smith", "+1486426786");
        book.add("Johnson", "+1741852969");
        book.add("Johnson", "+1789456123");

        book.get("Smith");
        book.get("Johnso");
        book.get("Johnson");


    }
}
