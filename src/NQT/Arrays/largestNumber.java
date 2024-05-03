package NQT.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] numbers = {4,6,3,8,910,2,11};
        System.out.println(findlargest(numbers));
    }
    static int findlargest(int[] numbers){
        int smallest = numbers[0];
        for( int i=0; i< numbers.length; i++){
            if (numbers[i] > smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
