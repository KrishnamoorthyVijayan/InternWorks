import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        int a = -1, b = 1;

        for(int i = 0; i<=n; i++) {
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}