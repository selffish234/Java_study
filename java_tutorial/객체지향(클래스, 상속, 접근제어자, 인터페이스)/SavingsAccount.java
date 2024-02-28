public class SavingsAccount extends BankAccount implements Withdrawable { //extends 라는 키워드를 통해서 상속

    boolean isOverdraft;
    void transfer() {};
    public void withdraw() { //외부에서 인터페이스를 가져와서 사용할때 항상 public을 붙여야한다.
        System.out.println("Withdraw");
    };

}
