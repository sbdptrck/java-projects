package Activity;

public class Fibonacci {
    public void fibonacci(int number) {
        int first = 0;
        int second = 1;
        int result;
        for(int i = 0; i < number; i++){
            result= first + second;
            first = second;
            second = result;
            System.out.print(first + "\t");
        }

    }
}
