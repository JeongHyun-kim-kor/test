import java.util.Scanner;

public class Test2 {

    // Scanner 라이브러리를 이용한 사칙연산 프로그램 + while문 사용하기
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        int a;
        int b;
        String c;

        System.out.println("사칙연산 프로그램에 필요한 연산자를 입력하시오");
        System.out.print("(+, -, *, / ) 중 한 가지를 선택하세요");
        c= sc.next();
        System.out.print("연산할 첫 번째 정수를 입력하세요");
        a = sc.nextInt();
        System.out.print("연산할 두 번째 정수를 입력하세요");
        b = sc.nextInt();

        if(c.equals("+")){
            System.out.println(a + " + " + b + " = " + " = "+ (a+b));
        }else if(c.equals("-")){
            System.out.println(a + " - " + b + " = "  + (a-b));
        }else if(c.equals("*")){
            System.out.println(a + " * " + b + " = " + (a*b));

        }else if(c.equals("/")){
            double result = (double)a / (double)b;
            System.out.println(a + " / " + b + " = " + result);
        } else{
            System.out.println("잘못된 값을 입력했습니다.");
        }
        sc.close();
        System.out.println("프로그램 종료");

    }
}
