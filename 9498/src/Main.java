import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();

        if (si<=100 && si>=90) {
            System.out.println('A');
        }
        else if (si<=89 && si>=80) {
            System.out.println('B');
        }
        else if (si<=79 && si>=70) {
            System.out.println('C');
        }
        else if (si<=69 && si>=60) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
        sc.close();
    }
}
