import java.util.ArrayList;

public class MethodExample2 {
    public static void main(String[] args) {
        ArrayList list_1 = new ArrayList<Integer>();
        list_1.add(10);
        list_1.add(100);
        printListElements(list_1);
    }


    //하나의 함수를 만들어보고 적절한 타입설정으로 내가 원하는 타입의 데이터가 반환되도록 연습하기
    static void printListElements(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}