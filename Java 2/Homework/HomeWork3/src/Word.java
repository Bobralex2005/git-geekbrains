import java.util.HashSet;

/**
 * Created by Alexander Bugaev on 12.07.2017.
 */
public class Word {

    /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
    слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово. */

    private String[] fruits = {"apple", "orange", "grape", "watermelon", "honeydew", "apple", "plum", "grape", "cherry", "orange"};
    //private String word;
    private HashSet<String> hs = new HashSet<String>();

    public static void main(String[] args) {
        Word work3 = new Word();

        for (String words : work3.fruits){
            if (!work3.hs.add(words)){
                System.out.print(words + " ");
            }
        }
        System.out.println("\n" + work3.hs.toString());
    }
}
