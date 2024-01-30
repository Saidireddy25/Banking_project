package PackageName;

import java.util.*;

public class operations {
    operations() {

    }

    List<Bank> bankList = new ArrayList<>();

    // creating account
    void createAccount(Bank bank) {
        Scanner sc = new Scanner(System.in);
        String autoText = "1000";
        long count = bankList.stream().count();
        String accountNumber = autoText + (count + 1);
        // accept the customer details
        System.out.println("enter customer name");
        String customerName = sc.nextLine();

        System.out.println("enter customer address");
        String address = sc.nextLine();

        System.out.println("enter initial amount to deposit");
        float amount = sc.nextFloat();

        // store the customer details

        bank.setAccountNumber(accountNumber);
        bank.setCustomerName(customerName);
        bank.setAddress(address);
        bank.setBalance(amount);

        bankList.add(bank);
    }

    // showing the details of customer
    void showAllCustmoer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        for (Bank b : bankList) {
            System.out.println("Account Number :" + b.getAccountNumber());
            System.out.println("        Name: " + b.getCustomerName());
            System.out.println("        Address: " + b.getAddress());
            System.out.println("         Bank: " + b.getBalance());
            System.out.println("==================================================");

        }
    }

    // showing current balance
    void showBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number");
        String accNo = sc.next();
        for (Bank b : bankList) {
            if (b.getAccountNumber().equals(accNo)) {
                System.out.println(b.getAccountNumber() + "has balance  : " + b.getBalance());
                System.out.println("==================================================");
            }
        }
    }

    // showing deposit
    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number");
        String accNo = sc.next();
        for (Bank b : bankList) {
            if (b.getAccountNumber().equals(accNo)) {
                System.out.println("enter the deposit amount");
                float amount = sc.nextFloat();

                // fetching the balance
                float x = b.getBalance();
                // changing the balance
                b.setBalance(x + amount);
                System.out.println("deposit amount updated");

            }
        }
    }

    // withdraw
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number");
        String accNo = sc.next();
        for (Bank b : bankList) {
            if (b.getAccountNumber().equals(accNo)) {
                System.out.println("enter the withdral amount");
                float amount = sc.nextFloat();

                // fetching the balance
                float x = b.getBalance();
                // changing the balance
                b.setBalance(x - amount);
                System.out.println("withdral amount updated");

            }
        }
    }

    // calculate interest
    void calculateInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the interest rate ");
        float rateOfInterest = sc.nextFloat();
        for (Bank b : bankList) {

            // fetching the balance
            float x = b.getBalance();
            // calculate interest
            float interest = (x * 1 * rateOfInterest) / 100;
            // changing the balance
            b.setBalance(x + interest);
            System.out.println("interest updated for acc num" + b.getAccountNumber());
        }
    }
}
