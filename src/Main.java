import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("Result: " + c);
    }
}