import java.util.*;

class Customer {
    private String name;
    private long accountNumber;
    private double balance;
    private long phone;
    private double loanAmount;
    private double loanInterest;
    private double fixedDepositAmount;
    private int fdTerm;

    public Customer(String name,long accountNumber,double balance,long phone) {
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.phone=phone;
        this.loanAmount=0.0;
        this.loanInterest=0.0;
        this.fixedDepositAmount=0.0;
        this.fdTerm=0;
    }

    public String getName(){return name;}
    public long getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}
    public long getPhone(){return phone;}

    public void setBalance(double balance){this.balance=balance;}
    public void setLoan(double loanAmount,double loanInterest){
        this.loanAmount=loanAmount;
        this.loanInterest=loanInterest;
    }
    public void setFixedDeposit(double amount,int term){
        this.fixedDepositAmount=amount;
        this.fdTerm=term;
    }

    public void displayCustomerInfo(){
        System.out.println("Name:"+name);
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
        System.out.println("Phone:"+phone);
        System.out.println("Loan Amount:"+loanAmount);
        System.out.println("Fixed Deposit Amount:"+fixedDepositAmount+" for "+fdTerm+" years");
    }
}
