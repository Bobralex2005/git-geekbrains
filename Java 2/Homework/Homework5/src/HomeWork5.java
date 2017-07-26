/**
 * Created by Alexander Bugaev on 18.07.2017.
 */
public class HomeWork5{
    static final int size = 10000000;
    static final int h = size / 2;

    public void justToFill() {
        float[] array = new float[size];
        //2) Заполняют этот массив единицами;
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }
        //3) Засекают время выполнения: long a = System.currentTimeMillis();
        long a = System.currentTimeMillis();
        //4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле: arr[i] = (float)(arr[i]
        // * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        for (int i = 0; i < size; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        //5) Проверяется время окончания метода System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public void splitAndDestroy(){
        float[] array = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        //2) Заполняют этот массив единицами;
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }
        //3) Засекают время выполнения: long a = System.currentTimeMillis();
        long a = System.currentTimeMillis();
        //Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти
        // массивы обратно в один
        System.arraycopy(array, 0, a1, 0, h);
        System.arraycopy(array, h, a2, 0, h);

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + (h + i) / 5) * Math.cos(0.2f + (h + i) / 5) * Math.cos(0.4f + (h + i) / 2));
                }
            }
        });
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1,0,array,0,h);
        System.arraycopy(a2,0,array,h,h);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void main(String[] args) {
        HomeWork5 hw = new HomeWork5();
        hw.justToFill();
        hw.splitAndDestroy();
    }
}
