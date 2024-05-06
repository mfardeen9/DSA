package NQT.Arrays;

import java.util.Arrays;

//Calculate Sum of the Elements of the Array
public class sumArray {
    public static void main(String[] args) {
        int[] nums ={ 10,10,10,10};
        String arr = Arrays.toString(nums);
        int n = nums.length;
        float sum = 0f;
        for (int i =0; i<n; i++){
            sum = sum + nums[i];
        }
        System.out.println("sum of Array "+arr+ " is: " +sum);
    }
}
