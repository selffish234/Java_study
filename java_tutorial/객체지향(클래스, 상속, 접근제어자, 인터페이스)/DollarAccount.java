public class DollarAccount extends BankAccount { //자바 언어는 단일상속 언어이다.
    // 오버로딩 => 부모(조상) 클래스에서 상속받은 메서드에서 파라미터를 변경
    // 새로운 메서드 정의!


    void inquiry(double currencyRate) {
    }

    // 오버라이딩 => 부모 클래스에서 상속받은 메서드의 내용 변경
    // 자식 클래스의 상황에 맞게
    public void deposit() {  // 오버라이딩은 여기를 변경 // 오버라이딩의 경우 부모와 같게 public 인지 private인지를 설정해줘야 한다.

    }
}
