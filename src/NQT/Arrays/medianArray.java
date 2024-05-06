package NQT.Arrays;
//Find Median of the given Array
import java.util.Arrays;

public class medianArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};
        int n = numbers.length;
        getMedian(numbers,n);
    }

    static void getMedian(int[] arr, int n){
        if (n%2==0) {
            int median = (arr[(n/2)-1] + arr[((n/2)+1)-1])/2;
            System.out.println("median: "+ median);
        }
        else {
            int median = arr[(n+1)/2 -1];
            System.out.println("median: "+ median);
        }
    }
}
