import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[31];

        for(int i=0;i<28;i++){
            int studentNum = sc.nextInt();
            students[studentNum]=1;
        }
        for(int i=1;i<=30;i++){
            if(students[i]!=1){
                System.out.println(i);
            }
            }
        }
    }