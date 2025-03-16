package Util;

public class Test {
    public static void fibonacci(int limit) {
        int f=0, s= 1;
        System.out.print(" fib : ");
        for (int i= 0; i < limit; i++){
            System.out.print(f + " ");
            int next = f+s;
            f=s;
            s=next;
        }



    }
}