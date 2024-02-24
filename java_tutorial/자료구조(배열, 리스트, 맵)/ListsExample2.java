import java.util.ArrayList;

public class ListsExample2 {
    public static void main(String[] args) {
        //Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList list = new ArrayList(10);
        ArrayList<String> list2 = new ArrayList(10); // ArrayList에서 자료형을 제한하고 싶다면 <> 안에 특정 객체타입을 넣을 수 있다.
        list.add(100);
        list2.add("INTP");

        for(int i = 0; i< list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
