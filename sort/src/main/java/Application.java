import java.util.Random;

/**
 * Created by an_wch on 2018/12/26.
 */
public class Application {

    public static void main(String[] args) {
        // 生成随机数组
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        // 打印生成数组
        printArray(array);
        // 1.冒泡排序
        SortUtils.bubbleSort(array);
        // end.输出数组
        printArray(array);
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }
}





