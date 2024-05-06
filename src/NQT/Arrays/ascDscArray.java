package NQT.Arrays;

import java.util.Arrays;
//Rearrange array in increasing-decreasing order
public class ascDscArray {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,8,12,34};
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=0; i<n/2; i++){
            System.out.print(arr[i]);
        }
        for (int i=n-1; i>=n/2; i--){
            System.out.print(arr[i]);
        }
    }

}
