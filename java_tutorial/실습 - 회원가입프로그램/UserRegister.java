import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {

    public static void main(String[] args) {

        System.out.println("========================");
        System.out.println("회원등록");
        System.out.println("========================");

        boolean register = false;
        Scanner sc = new Scanner(System.in); // import 할땐 ctrl + space // 입력을 받는 Scanner 객체 sc를 생성

        while (!register) {

            System.out.println("회원가입을 하시겠습니까?\n Y: 진행  N: 취소");
            System.out.print(">> ");
            String register_input = sc.nextLine(); // 사용자들의 입력을 대기하다가 사용자들이 엔터를 누르면 되게하는 함수

            if (register_input.equalsIgnoreCase("y")) {
                register = true; // register가 false에서 true 가 되며 while(!register는 !true 즉 false 가 되며 while 문 종료
                System.out.println("========================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("========================");
            } else if (register_input.equalsIgnoreCase("N")) {
                System.out.println("========================");
                System.out.println("회원가입이 종료됩니다.");
                System.exit(0); // 정상적으로 while 문을 끝내는 코드 System.exit(0)
            } else {
                System.out.println("입력 값을 확인해주세요.");
            }

        }

        ArrayList users = new ArrayList();

        while (true) {

            HashMap user = new HashMap();

            // ID
            System.out.print("ID: ");
            String username = sc.nextLine();

            //PW
            String password = "";
            while (true) {
                System.out.print("PW: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String password_confirm = sc.nextLine();

                if (password.equals(password_confirm)) {
                    break;
                } else {
                    System.out.println("========================");
                    System.out.println("패스워드가 일치하지 않습니다.");
                    System.out.println("패스워드를 다시 입력해주세요.");
                    System.out.println("========================");
                }
            }

            // 이름
            System.out.print("성명: ");
            String name = sc.nextLine();

            //생년월일(6자리)
            String birth_date = "";
            while (true) {
                System.out.print("생년월일(6자리): ");
                birth_date = sc.nextLine();
                if (birth_date.length() == 6) {
                    break;
                } else {
                    System.out.println("========================");
                    System.out.println("생년월일 자릿수가 올바르지 않습니다.");
                    System.out.println("생년월일을 다시 입력해주세요.");
                    System.out.println("========================");
                }
            }

            // 이메일
            System.out.print("이메일: ");
            String email = sc.nextLine();


            user.put("username", username); //user 라는 해쉬맵객체에 각각 만든 정보들을 집어넣음
            user.put("password", password);
            user.put("name", name);
            user.put("birth_date", birth_date);
            user.put("email", email);

            users.add(user); // 리스트 users에 한 고객의 정보가 담긴 해쉬맵 user을 넣음

            System.out.println("---------------------");
            System.out.println(user.get("name") + " 님, 가입을 환영합니다.");
            System.out.println("ID는 " + user.get("username") + " 입니다.");
            System.out.println("---------------------");

            System.out.println("회원가입을 이어서 진행하겠습니까?\n Y: 진행  N: 취소");
            System.out.print(">> ");
            String register_again = sc.nextLine();

            if (register_again.equalsIgnoreCase("y")) {
                ;
            } else if (register_again.equalsIgnoreCase("n")) {
                System.out.println("회원가입 프로그램이 종료됩니다.");
                System.exit(0);
            }


        }
    }
}