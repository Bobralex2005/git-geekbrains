import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alexander Bugaev on 30.06.2017.
 */
public class HomeWork5 {
    static int array[] = {45, 86, 32, 56, 79, 95, 43, 58, 12, 99, 35, 87, 10, 67, 89};
    static int array2[] = {45, 86, 32, 56, 79, 95, 43, 58, 12, 99, 35, 87, 10, 67, 89};
    static int searchKey;
    static Scanner scn = new Scanner(System.in);
    static int operationQntbubbleSort = 0;
    static int operationQntShakedSort = 0;
    static long t1, t2;

    static void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    static void swap2(int one, int two) {
        int temp = array2[one];
        array2[one] = array2[two];
        array2[two] = temp;
    }

    //1. Попробовать оптимизировать пузырьковую сортировку. Сравнить количество операций
    //сравнения оптимизированной и не оптимизированной программы.
    static void bubleSort(int arr[]) {
        System.out.println("Array before\n" + Arrays.toString(arr));
        int in, out;
        t1 = System.nanoTime();
        for (out = (arr.length - 1); out >= 1; out--) {
            operationQntbubbleSort = operationQntbubbleSort + out;
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
        t2 = System.nanoTime();
        System.out.println("Array after bubble sort\n" + Arrays.toString(arr));
        System.out.println("Sorting takes = " + (t2 - t1) + " nanoseconds");
    }

    //2. Реализовать шейкерную сортировку.
    static void shakerSort(int arr[]){
        System.out.println("Array before\n" + Arrays.toString(arr));
        int out, in, min;
        t1 = System.nanoTime();
        for (out = 0; out < arr.length - 1; out++) {//outer cycle
            operationQntShakedSort = operationQntShakedSort + out;
            min = out;//minimum
            for (in = out + 1; in < arr.length; in++)
                if (arr[in] < arr[min])
                    min = in;//new minimum found
                    swap2(out, min);
        }
        t2 = System.nanoTime();
        System.out.println("Array after shacked sort\n" + Arrays.toString(arr));
        System.out.println("Sorting takes = " + (t2 - t1) + " nanoseconds");
    }
    //3. Реализовать бинарный алгоритм поиска в виде функции, которой передается
    //отсортированный массив. Функция возвращает индекс найденного элемента или -1, если
    //элемент не найден.
    static int binarySearch(int arr[], int searchKey){
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        int curIn;
        while (true){
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey) {
                return curIn;

            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (arr[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else upperBound = curIn - 1;
            }
        }
    }

    //4. *Подсчитать количество операций для каждой из сортировок и сравнить его с  асимптотической
    // сложностью алгоритма
    static void algorithmEfficiency(){
        System.out.println("Expected operations quantity for Bubble sort is O(N * N) = " + array.length *
                        (array.length - 1) / 2 + "\nCalculated quantity = " + operationQntbubbleSort + " operations");
        System.out.println("Expected operations quantity for Shacked sort is O(N * N) = " + array2.length *
                (array2.length - 1) / 2 + "\nCalculated quantity = " + operationQntShakedSort + " operations");
    }

    public static void main(String[] args) {
        bubleSort(array);
        shakerSort(array2);
        algorithmEfficiency();
        System.out.println("Please insert number which you wanna find");
        searchKey = scn.nextInt();
        System.out.println("Searched number located at array[" + binarySearch(array, searchKey) + "]");
    }
}
