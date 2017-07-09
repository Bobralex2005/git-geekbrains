import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alexander Bugaev on 09.07.2017.
 */
public class Main {

    private String incomingData = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
    private String[][] array = new String[4][4];
    private int summ;

    //Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в
    //двумерный массив типа String[][];
    public void stringToArray(String str){
        //god bless regex :)
        String[] row = str.split("\n");
        int i = 0;
        for (String s : row) {
            if (i >= 4) throw new MySizeArrayException();
            array[i++] = s.split("\\s");
        }
    }

    /*2 Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст
    вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно
    ячейке лежат неверные данные. */
    public int stringToInteger(){
//        for (String[] i : array) {
//            for (String j : i) {
        Pattern p = Pattern.compile("[a-zA-Z]+");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Matcher m = p.matcher(array[i][j]);
                if (m.matches()) throw new MyArrayDataException(i, j);
                summ = summ + Integer.parseInt(array[i][j]);
            }
        }
        return summ / 2;
    }

    public String getIncomingData() {
        return incomingData;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.stringToArray(main.getIncomingData());
        System.out.println(Arrays.deepToString(main.array));
        System.out.println("Summ of array divided by 2 = " + main.stringToInteger());
    }
}
