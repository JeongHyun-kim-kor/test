import java.util.Scanner;

public class CalculatorTest {

    // 2개의 값을 입력받아 계산기를 만들어 보자
    public void calculator(){

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("연산자를 입력하세요(+, -, *, / 중 1개 택)");
            String op = sc.next();

            System.out.print("첫번째 값 입력 : ");
            int num1 = sc.nextInt();

            System.out.print("두번째 값 입력 : ");
            int num2 = sc.nextInt();

            int result ;


            switch (op) {

                case "+":
                    result = num1 + num2;
                    System.out.print("더하기 진행 : " + num1 + " + " + num2 + " = " + result);
                    System.out.println();
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.print("빼기 진행 : " + num1 + " - " + num2 + " = " + result);
                    System.out.println();
                    break;

                default:
                    System.out.println("연산자를 잘못 입력하셨습니다.");
                    result = 0;
                    break;
            } // switch문
            System.out.print("계속 하시겠습니까?(y/n)");
            char choice = sc.next().charAt(0);
            if(choice == 'n' || choice == 'N'){
                flag = false;
            }

        } // while문



    }
}
