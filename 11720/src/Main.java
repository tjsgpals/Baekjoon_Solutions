import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;

        for(int i=0;i<t;i++){
            char ch = s.charAt(i);
            int su = ch-'0';
            sum += su;
        }
        System.out.println(sum);
    }
}