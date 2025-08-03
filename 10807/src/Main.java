import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]numbers= new int[n];

        for(int i=0;i<n;i++) {
            numbers[i]=sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;

        for(int i=0;i<n;i++) {
            if(numbers[i]==v){
                count+=1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}