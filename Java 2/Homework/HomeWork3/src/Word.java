import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Alexander Bugaev on 12.07.2017.
 */
public class Word {

    /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
    слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово. */

    private String[] fruits = {"apple", "orange", "grape", "watermelon", "honeydew", "apple", "plum", "grape", "cherry", "orange"};
    private HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        Word work3 = new Word();

        for (String words : work3.fruits){
            work3.hm.put(words, work3.hm.getOrDefault(words, 0) + 1);
        }
        System.out.println(work3.hm + "\n" + work3.hm.keySet());
    }
}
