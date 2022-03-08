public class Testttt {

    public static void main(String[] args) {
        int[] nums = {0,9,3,2,7,8,10,1,4,6};
        int sum = 0;
        int arrSum = 0;
        for(int i=0; i<= nums.length; i++) {
            sum = sum + i;
            if(i < nums.length) {
                arrSum = arrSum + nums[i];
            }
        }
        System.out.println(sum-arrSum);
    }
}
