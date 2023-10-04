package Arrays;
import math

public static int power(int a){
    return math.power(a,a);
}
public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {5, 4, 0, 3, 1, 2,5,6};
        System.out.println(arrayNesting(nums));
    }

    public static int arrayNesting(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int size = 0;
            for (int k = i; nums[k] >= 0; size++) {
                int ak = nums[k];
                nums[k] = -1;
                k = ak;
            }
            count = Integer.max(count, size);
        }
        return count;
    }
}
