package pastExams.y2017.winter;

public class SavingsAccount extends BankAccount implements Taxable {
    private String Type = "Savings";
    private double taxRate;

    public SavingsAccount(Person accHolder, int accNumber, double balance,double taxRate){
        super(accHolder,accNumber,balance);
        setTaxRate(taxRate);
    }

    public SavingsAccount(){
        this(null,0,0,0);

    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calcTax() {
        return 0;
    }

    @Override
    public String toString() {
        return "Account Type: " + getType()  + "\n" +  super.toString() + "\ntaxRate: " + getTaxRate();

    }
}
