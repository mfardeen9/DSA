public class nthFibo {
    public static void main(String[] args) {
        System.out.println(fibo(19));
    }

    static int fibo(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibo(n -1 ) + fibo(n-2);
        }
    }
}
