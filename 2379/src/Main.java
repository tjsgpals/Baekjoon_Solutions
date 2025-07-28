import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gu = sc.nextInt();

        for(int i=1;i<=9; i+=1) {
            System.out.println(gu+ " * "+ i + " = " + (gu*i));
        }
        sc.close();
    }
}