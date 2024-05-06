package NQT.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        reverse(arr,n);

    }
    static void reverse(int[] arr, int n){
        int p1=0;
        int p2= n-1;
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr,n);
    }
    static void printArray(int[]arr, int n){
        System.out.print("Reversed array:");
        for (int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
