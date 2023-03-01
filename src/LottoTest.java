import java.util.Arrays;

public class LottoTest {

    public void lotto(){

        // 로또 번호를 입력받을 배열 선언
        int [] lotto = new int[6];

//        System.out.print("로또 번호 : ");
        for(int i = 0; i < lotto.length; i++ ){
            int num = (int)(Math.random() * 45) + 1;
            // Math.random() 은 0과 1 사이의 값 리턴(double타입, 0<= 값 < 1)
            // num이 int형이기 때문에 Math.random()을 int로 형변환
            // 1. Math.random()  >> 0.0 <= 값 < 1.0
            // 2. (int)(Math.random()) >> 0 <= 값 < 1
            // 3. (int)(Math.random() * 45) >>  0<= 값 <45
            // 4. (int)(Math.random() * 45) + 1 >> 1<= 값 <46
            // ∴ 1부터 45까지의 정수만 나오게 된다

            lotto[i] = num; // 생성한 난수를 lotto 배열에 대입
//            System.out.println(lotto[i]);

            //중복 번호 제거
            for(int j = 0; j < i ; j++){
                if(lotto[i] == lotto[j]){  // 중복된 번호가 있으면 이전 포문으로 돌아간다
                    i--;                   // i의 숫자를 한번더 줄여서 다시 랜덤숫자를 추출해주게 된다.
                }
                // 오름차순 처리 로직
                if(lotto[i] < lotto[j]){
                    int lottoTemp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = lottoTemp;
                }
            }

        }
        System.out.println("방법 1.");
        System.out.print("로또 번호 (1) : ");
        for(int i =0; i <lotto.length; i++){
            System.out.print(lotto[i]+ " ");
        }
        System.out.println();
        System.out.println("방법 2.");
        System.out.println("로또 번호 (2) : " + Arrays.toString(lotto));



    }
}
