public class fiboUsingLoop {
    public static void main(String[] args) {
        int prev1 =0; //1
        int prev2 =1; //1   0 1 1
        System.out.println(prev1);
        System.out.println(prev2);
        for(int fibo=0; fibo<18; fibo++){
            int sum = prev1 + prev2;
            System.out.println(sum);
            prev1 = prev2;
            prev2 = sum;
        }

    }
}
