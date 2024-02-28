public class BankAccount {

    // 멤버변수 // 은행계좌라면 가져야할 정보들
    //멤버변수 자료형 앞에 private를 붙여 함부로 멤버변수를 변경할 수 없게 한다.
    // private => 동일 클래스안에서만 참조, 수정 가능
    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password = 1234;

    // 메소드 // 은행계좌라면 가져야하는 기능들
    public void inquiry() {}
    public void deposit() {}
    public void heldInDormant() {}
    public void changePassword(int password) {
        this.password = password;
    }

    // 생성자 (아마 인스턴스..)
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치해야한다.
    // new 연산자와 함께 사용

    BankAccount() {}
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant // 소괄호 안에 필요한 정보들 (멤버변수들을 넣기)
    ) { //this 는 인스턴스 자기 자신을 가리킴
        this.bankCode = bankCode; // 등호기준 왼쪽은 멤버변수 오른쪽은 입력받은 값
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }
// getter : 인스턴스의 멤버변수 값을 변경하는것, setter : 조회해 오는것

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    // 인터페이스
    // 클래스가 설계도라면 인터페이스는 스케치 정도
    // 메서드이름 파라미터 반환 타입 정도만 가질 수 있음
}
