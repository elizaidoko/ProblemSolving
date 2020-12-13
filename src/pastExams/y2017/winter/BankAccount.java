package pastExams.y2017.winter;

public class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;

    public BankAccount(Person accHolder, int accNum, double balance){
        setAccHolder(accHolder);
        setAccNum(accNum);
        setBalance(balance);
    }

    public BankAccount(){
        this(null,0,0.0);
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accHolder.toString() + "\nAccount Number: " + getAccHolder() + "\nBalance: " +
                getBalance();
    }
}
