import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        algo algo = new algo();
        System.out.println(algo);

        System.out.println("Hello world!");

        List<String> listA = new ArrayList<>();

        listA.add("김삿갓");
        listA.add("홍아리");
        listA.add(new String("새로운 홍길동"));
        listA.add("홍길동2");
        listA.add("홍길동2");
        listA.add(1,"1번째 요소값");

//        String student = new String(name,age);
        listA.remove("홍길동2");

        List<String> listB = new LinkedList<>();

       


        System.out.println(listA);
    }
}