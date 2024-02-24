public class Loops {

    public static void main(String[] args) {

        // 반복문
        // 1.for
        // 초기화된 변수. 조건식. 증감식

//        for (int i = 0; i< 10; i+=2) {
//            System.out.println(i);

        // while

        int b = 0;

//        while (b > 0) {
//            System.out.println(b);
//            b--;
//        }
        do {
            System.out.println(b);
            b--; // do while은 일단 do 한번 하고 그다음 while로 판별
        } while (b > 0);
    }
}