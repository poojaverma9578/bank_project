import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();

        while(true) {
            System.out.println("Choose an option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");

            int choice=sc.nextInt();
            if(choice==1) {
                System.out.println("Enter Account Number:");
                long accountNumber=sc.nextLong();
                System.out.println("Enter Phone Number:");
                long phone=sc.nextLong();
                Customer customer=bank.getCustomerFromDatabase(accountNumber,phone);

                if(customer!=null) {
                    boolean isLoggedIn=true;
                    while(isLoggedIn) {
                        System.out.println("Choose an option:");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Transfer");
                        System.out.println("4. Apply for Loan");
                        System.out.println("5. Fixed Deposit");
                        System.out.println("6. View Balance");
                        System.out.println("7. Logout");

                        int option=sc.nextInt();
                        switch(option) {
                            case 1:
                                System.out.println("Enter deposit amount:");
                                double depositAmount=sc.nextDouble();
                                bank.processDeposit(accountNumber,depositAmount,phone);
                                break;
                            case 2:
                                System.out.println("Enter withdrawal amount:");
                                double withdrawalAmount=sc.nextDouble();
                                bank.processWithdrawal(accountNumber,withdrawalAmount,phone);
                                break;
                            case 3:
                                System.out.println("Enter target account number:");
                                long toAccount=sc.nextLong();
                                System.out.println("Enter transfer amount:");
                                double transferAmount=sc.nextDouble();
                                bank.processTransfer(accountNumber,toAccount,transferAmount,phone);
                                break;
                            case 4:
                                System.out.println("Enter loan amount:");
                                double loanAmount=sc.nextDouble();
                                System.out.println("Enter loan interest rate:");
                                double interestRate=sc.nextDouble();
                                bank.applyForLoan(accountNumber,loanAmount,interestRate,phone);
                                break;
                            case 5:
                                System.out.println("Enter FD amount:");
                                double fdAmount=sc.nextDouble();
                                System.out.println("Enter FD term in years:");
                                int fdTerm=sc.nextInt();
                                bank.createFixedDeposit(accountNumber,fdAmount,fdTerm,phone);
                                break;
                            case 6:
                                customer.displayCustomerInfo();
                                break;
                            case 7:
                                isLoggedIn=false;
                                System.out.println("Logged out.");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    }
                }
            } else if(choice==2) {
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            }
        }
    }
}
