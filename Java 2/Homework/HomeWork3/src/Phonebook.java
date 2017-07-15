import java.util.LinkedList;

/**
 * Created by Alexander Bugaev on 12.07.2017.
 */
public class Phonebook {

    /*Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот
    телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона
    по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда
    при запросе такой фамилии должны выводиться все телефоны. */

    private LinkedList<Person> ll = new LinkedList<>();

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Person person1 = new Person("Smith", +12345678);
        phonebook.ll.add(person1);
        System.out.println(person1.get("John"));

    }
}
