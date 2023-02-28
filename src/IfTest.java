public class IfTest {

    public void normalIf(){
        int score = 80;
        if(score > 60){
            System.out.println("합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }
    }

    public void elseIf(){
        int score = 80;

        if(score >= 90){
            System.out.println("A");

        }else if(score >= 80) {
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }


}
