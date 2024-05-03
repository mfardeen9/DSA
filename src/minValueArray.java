public class minValueArray {
    public static void main(String[] args) {
        int[] arr = {-2,4,6,7,-9,1,3};
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int minValue = arr[0];
        for (int min = 0; min < arr.length; min++) {
            if (arr[min] < minValue) {
                minValue = arr[min];
            }
        }
        return minValue;
    }
}
