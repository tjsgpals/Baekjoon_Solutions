import java.util.Scanner;     //숫자 시행 시 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[]arr = new int[26];
        for(int j=0;j<26;j++) arr[j]=-1;
       
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==-1){
                arr[ch-'a']=i;
            }           
        }
        for(int j=0;j<26;j++){
            System.out.print(arr[j]+ " ");
        }      
    }
}