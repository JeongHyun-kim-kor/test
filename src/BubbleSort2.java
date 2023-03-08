import java.util.Arrays;

public class BubbleSort2 {

    public static void main(String[] args) {

        int[] array = {20, 45, 2 , 88,65,11,34,58};

        for(int i = 1; i<array.length; i++){  // 배열길이의 -1 만큼 반복

            for(int j = 0; j < i; j++){
                if(array[i] < array[j]){

                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

            System.out.println(Arrays.toString(array));

        }

    }
}
