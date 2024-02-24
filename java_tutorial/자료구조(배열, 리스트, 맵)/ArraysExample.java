public class ArraysExample {

    public static void main(String[] args) {

        // 배열(Arrays)

        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INFP", "ENFP", "ISTJ", "ESTP"};

        System.out.println(mbti.length);

        for (int i = 0; i < mbti.length; i++ ) {
            System.out.println(mbti[i]);
        }
//        System.out.println(price[1]);
//        System.out.println(mbti[0]);



//        price[1] = 8000;
//        System.out.println(price[1]);
//        System.out.println(price); //[I@34ce8af7 price 자료형 자체는 기본형이 아니기에 주소값을 출력함



    }
}
