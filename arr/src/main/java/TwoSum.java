import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by an_wch on 2018/11/5.
 */
public class TwoSum {


    public static void main(String[] args) {
        int [] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));

    }

    /**
     * 解法1
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            } 
        }
        return null;
    }

    /**
     * 优化
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
