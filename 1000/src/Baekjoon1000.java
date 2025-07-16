import java.util.Scanner; // 이 줄이 맨 위에 와야 해!

public class Baekjoon1000 { // public class 선언 시작
    public static void main(String[] args) { // main 메서드 시작
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성합니다.
        int a = sc.nextInt(); // 첫 번째 정수를 입력받습니다.
        int b = sc.nextInt(); // 두 번째 정수를 입력받습니다.
        System.out.println(a + b); // 두 정수를 더한 값을 출력합니다.
        sc.close(); // Scanner 객체를 닫아줍니다.
    }
} // public class 선언 끝