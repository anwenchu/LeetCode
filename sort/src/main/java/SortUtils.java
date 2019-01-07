/**
 * 排序算法
 * Created by an_wch on 2018/12/26.
 */
public class SortUtils {

    /**
     * 冒泡排序
     * 稳定
     * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
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

    /**
     * 选择排序
     * 不稳定
     * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (0 == array.length) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }

    /**
     * 插入排序
     * 稳定
     * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        int current;
        for (int i = 1; i < array.length; i++) {
//            current = array[i];
//            for (int j = i -1; j >= 0 ; j--) {
//                if (current < array[j]) {
//                    array[j + 1] = array[j];
//                    array[j] = current;
//                } else {
////                    array[j] = current;
//                    break;
//                }
//            }
            current = array[i];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex - 1]) {
                array[preIndex] = array[preIndex - 1];
                preIndex--;
            }
            array[preIndex] = current;
        }
        return array;
    }

}
