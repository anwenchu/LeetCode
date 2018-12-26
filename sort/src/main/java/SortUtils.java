/**
 * 排序算法
 * Created by an_wch on 2018/12/26.
 */
public class SortUtils {

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (0 == array.length) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {

        return array;
    }

}
