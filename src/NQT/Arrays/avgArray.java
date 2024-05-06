package NQT.Arrays;

public class avgArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int n = arr.length;
        int sum =0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("Average of Array: "+avg);
    }
}
