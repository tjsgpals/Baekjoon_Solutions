import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int oneja = b%10;
        int sibja = (b/10)%10;
        int bakja = b/100;

        System.out.println(a*oneja);
        System.out.println(a*sibja);
        System.out.println(a*bakja);
        System.out.println(a*b);
    }
}