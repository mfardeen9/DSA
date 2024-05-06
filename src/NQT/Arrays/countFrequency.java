package NQT.Arrays;
//Count frequency of each element in the array

public class countFrequency {
    public static void main(String[] args) {
    int[] arr = {10,2,2,2,5,10,1,5,1};
    int n = arr.length;
    count(arr,n);
    }
    static void count(int[] arr, int n){
        boolean visited[] = new boolean[n];
        for (int i=0; i<n; i++){
            //skip the element if already processed
            if (visited[i] == true)
                continue;

            //COUNT FREQUENCY
            int counter =1;
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    counter++;
                }
            }
            System.out.println(arr[i]+" occurred "+ counter +" times");
        }
    }
}
