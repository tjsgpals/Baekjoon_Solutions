import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n입력받고 배열만듦
        int n = sc.nextInt();
        int[]score = new int[n];
        
        //for루프돌면서 모든점수 배열에넣기
        for(int i =0; i<n; i++){
            score[i]= sc.nextInt();
        }
        //최댓값,총합계산 변수만들기
        double sum = 0;
        double max = score[0];

        for(int i = 1;i<n;i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        for(int i =0;i<n;i++){
            sum += (score[i]/max) *100;
        }
        System.out.println(sum/n);
    }
}