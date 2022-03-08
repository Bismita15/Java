import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        // int[] nums = {10, 20, 30};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
//        Array nums = new Array(3);
//        nums.insert(10);
//        nums.insert(20);
//        nums.insert(30);
//        System.out.println(nums.indexOf(1));

    }
}
