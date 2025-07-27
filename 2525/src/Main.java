import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int total = ((h*60+m)+t);

        int newh = (total/60) % 24;
        int newm = total%60;

        System.out.println(newh+" "+newm);

        sc.close();

    }
}