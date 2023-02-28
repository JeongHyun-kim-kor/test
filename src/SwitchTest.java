import java.util.Scanner;

public class SwitchTest {

                public void NormalSwitch(){

                    System.out.print("번호를 입력해주세요 : ");
                    Scanner sc = new Scanner(System.in);
                    int num = sc.nextInt();

                    switch(num){
                        case 1 : case 2 :
                            System.out.println("1번과 2번 선택시");
                            break;
                        case 3 : case 4 :
                            System.out.println("3번과 4번 선택시");
                            break;
                        default:
                            System.out.println("그 외 번호 선택");
                break;
        }

    }

}
