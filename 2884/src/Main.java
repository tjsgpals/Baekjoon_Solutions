import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m>=45) {
            System.out.println(h+" "+(m-45));
        }
        else {
            int newm = m + 15;
            int newh = h - 1;

            if(newh < 0) {
                newh = 23;
            }
            System.out.println(newh+" "+newm);
        }
        sc.close();
        }
    }