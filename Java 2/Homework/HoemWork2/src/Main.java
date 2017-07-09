import java.util.Arrays;

/**
 * Created by Alexander Bugaev on 09.07.2017.
 */
public class Main {

    private String incomingData = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
    private String[][] array = new String[4][4];
    private int summ;

    //Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в
    //двумерный массив типа String[][];
    public void stringToArray(String str) throws ArrayIndexOutOfBoundsException {
        //god bless regex :)
        String[] row = str.split("\n");
        //System.out.println(Arrays.toString(row));
        int i = 0;
        for (String s : row) {
            array[i++] = s.split("\\s");
        }
        //System.out.println(Arrays.deepToString(array));
    }

    //Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную
    //сумму на 2, и вернуть результат;
    public int stringToInteger() throws NumberFormatException {
        for (String[] i : array) {
            for (String j : i) {
                summ = summ + Integer.parseInt(j);
            }
        }
        return summ / 2;
    }

    public String getIncomingData() {
        return incomingData;
    }

    public static void main(String[] args) {
        //Ваш метод должен бросить исключения в случаях:
        //○ Если размер матрицы, полученной из строки, не равен 4x4;
        //○ Если в одной из ячеек полученной матрицы не число; (например символ или слово)
        //В методе main необходимо вызвать полученный метод, обработать возможные исключения и
        //вывести результат расчета.

        Main main = new Main();
        try {
            main.stringToArray(main.getIncomingData());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.deepToString(main.array));
        try {
            System.out.println(main.stringToInteger());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
