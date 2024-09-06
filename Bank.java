import java.sql.*;
import java.util.*;

class Bank {
    private Connection conn;
    private Map<Long,Customer> customerMap;

    public Bank() {
        customerMap=new HashMap<>();
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","gautum1234");
            System.out.println("Database Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCustomerToDatabase(String name,long accountNumber,double balance,long phone) {
        String query="INSERT INTO customers (name,accountNumber,balance,phone) VALUES (?,?,?,?)";
        try(PreparedStatement stmt=conn.prepareStatement(query)) {
            stmt.setString(1,name);
            stmt.setLong(2,accountNumber);
            stmt.setDouble(3,balance);
            stmt.setLong(4,phone);
            stmt.executeUpdate();
            System.out.println("Customer added to the database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerFromDatabase(long accountNumber,long phone) {
        String query="SELECT * FROM customers WHERE accountNumber=? AND phone=?";
        try(PreparedStatement stmt=conn.prepareStatement(query)) {
            stmt.setLong(1,accountNumber);
            stmt.setLong(2,phone);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()) {
                String name=rs.getString("name");
                double balance=rs.getDouble("balance");
                Customer customer=new Customer(name,accountNumber,balance,phone);
                customerMap.put(accountNumber,customer);
                return customer;
            } else {
                System.out.println("Invalid login credentials.");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateBalance(long accountNumber,double newBalance) {
        String query="UPDATE customers SET balance=? WHERE accountNumber=?";
        try(PreparedStatement stmt=conn.prepareStatement(query)) {
            stmt.setDouble(1,newBalance);
            stmt.setLong(2,accountNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void processDeposit(long accountNumber,double amount,long phone) {
        Customer customer=getCustomerFromDatabase(accountNumber,phone);
        if(customer!=null) {
            double newBalance=customer.getBalance()+amount;
            updateBalance(accountNumber,newBalance);
            customer.setBalance(newBalance);
            System.out.println("Deposit successful. New Balance:"+newBalance);
        }
    }

    public void processWithdrawal(long accountNumber,double amount,long phone) {
        Customer customer=getCustomerFromDatabase(accountNumber,phone);
        if(customer!=null) {
            if(customer.getBalance()>=amount) {
                double newBalance=customer.getBalance()-amount;
                updateBalance(accountNumber,newBalance);
                customer.setBalance(newBalance);
                System.out.println("Withdrawal successful. New Balance:"+newBalance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public void processTransfer(long fromAccount,long toAccount,double amount,long phone) {
        Customer fromCustomer=getCustomerFromDatabase(fromAccount,phone);
        Customer toCustomer=getCustomerFromDatabase(toAccount,phone);
        if(fromCustomer!=null && toCustomer!=null) {
            if(fromCustomer.getBalance()>=amount) {
                double newFromBalance=fromCustomer.getBalance()-amount;
                double newToBalance=toCustomer.getBalance()+amount;
                updateBalance(fromAccount,newFromBalance);
                updateBalance(toAccount,newToBalance);
                fromCustomer.setBalance(newFromBalance);
                toCustomer.setBalance(newToBalance);
                System.out.println("Transfer successful. From Balance:"+newFromBalance+" To Balance:"+newToBalance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public void applyForLoan(long accountNumber,double loanAmount,double interestRate,long phone) {
        Customer customer=getCustomerFromDatabase(accountNumber,phone);
        if(customer!=null) {
            customer.setLoan(loanAmount,interestRate);
            System.out.println("Loan granted. Amount:"+loanAmount+" at "+interestRate+"% interest.");
        }
    }

    public void createFixedDeposit(long accountNumber,double amount,int term,long phone) {
        Customer customer=getCustomerFromDatabase(accountNumber,phone);
        if(customer!=null) {
            customer.setFixedDeposit(amount,term);
            System.out.println("Fixed Deposit created. Amount:"+amount+" for "+term+" years.");
        }
    }
}
