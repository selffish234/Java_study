import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 입력받기위해 Scanner가 필요

        System.out.print("아이디를 입력해주세요. >>"); //printlm이면 개행이 이루어짐
        String username = sc.nextLine(); // 입력값을 받는 함수 next

        System.out.print("생년월일을 입력해주세요. >>");
        int birthDate = sc.nextInt(); // 숫자데이터기에 nextInt


        System.out.printf("%s \t%d", username, birthDate); // \n은 한줄 띄고, \t는 한칸 띄고
    }
}
