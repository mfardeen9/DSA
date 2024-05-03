package NQT.Arrays;

public class smallestNumber {

    public static void main(String[] args) {
        int[] numbers = {4,6,3,8,910,2,11};
        System.out.println(find(numbers));
    }
    static int find(int[] numbers){
        int smallest = numbers[0];
        for( int i=0; i< numbers.length; i++){
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
