public class Conditional {

    public static void main(String[] args) {

//        int a = 1;
//        int b = 100;
//
//        // 다중 조건의 경우 조건을 만족하는 최초의 분기만 실행
//        if (a == b) {
//            System.out.println("a == b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else if (a <= b) {
//            System.out.println("a <= b"); // 최초의 분기가 아니라 실행되지 않음
//        } else {
//            System.out.println("else");
//        }


//        if (a != b) {
//            System.out.println("a != b");
//        } else {
//            System.out.println("else block");
//        }

        int a = 10;

        switch (a + 1) {

            // break 로 조건에 맞은 후 다음에 오는 조건에 맞지 않는 것들이 실행되지 않게 해야함
            // case 뒤에가 a+1 (10+1) 에 해당하는 값일때
            case 10:
                System.out.println("a + 1 == 10");
                break;
            case 12:
                System.out.println("a + 1 == 12");
                break;
            case 9:
                System.out.println("a + 1 == 9");
                break;
            default:
                System.out.println("default");

        }
    }
}