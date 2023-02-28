public class ForTest {

    public void gugudan(){

        int dan;
        int num ;


        for(dan = 1; dan < 10; dan++){
            //1단부터 9단까지  1 X ~ 9 X 까지
            for(num = 1; num < 10; num++){
                // ? X 1 ~ ? X 9까지
                System.out.println(dan +" X " + num + " = " + (dan*num));
            }
            System.out.println();
        }

    }
}
