import java.util.ArrayList;

public class algo {
    public int[] solution() {
    int n = 15;
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i<= n ; i++){
            if(n % i == 0){

                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}
