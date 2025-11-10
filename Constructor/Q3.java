/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all fields
A method deposit() to add money
A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/
import java.util.*;

class Q3 {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Number of People: ");
        int n = xyz.nextInt();
        xyz.nextLine(); // Consume the newline character
        
        BankAccount BA[] = new BankAccount[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Person " + (i + 1));
            
            System.out.print("Enter Account Number: ");
            String accNo = xyz.nextLine();  // Read account number as a string
            
            System.out.print("Enter Account Holder Name: ");
            String accHolder = xyz.nextLine();
            
            System.out.println("Enter Deposit Amount:");
            double depAmt = xyz.nextDouble();
            xyz.nextLine(); // Consume the newline character
            
            BA[i] = new BankAccount(accNo, accHolder, 1000);
            BA[i].deposit(depAmt);
            BA[i].display();
        }
        
        xyz.close();
    }
}

class BankAccount {
    private String accNo;
    private String accHolder;
    private double balance;
    
    public BankAccount() {
        balance = 1000;
    }
    
    public BankAccount(String accNo, String accHolder, double balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }
    
    public String getAccNo() {
        return accNo;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
