package PackageName;

import java.util.*;

public class menu {
        public static void main(String[] args) {
                // creating the menu
                Scanner sc = new Scanner(System.in);
                operations operations = new operations();
                while (true) {
                        // menu options
                        System.out.println(" *****  welcome to bank of brute ***** /n");
                        System.out.println("1. create an account");
                        System.out.println("2. display customer");
                        System.out.println("3. display balance");
                        System.out.println("4. deposit");
                        System.out.println("5. withdrawl");
                        System.out.println("6. Calculate interest");
                        System.out.println("enter your choice");
                        int option = sc.nextInt();
                        Bank bank = new Bank();
                        switch (option) {
                                // calling the create acocunt method
                                case 1:
                                        operations.createAccount(bank);
                                        break;
                                case 2:
                                        operations.showAllCustmoer();
                                        break;
                                case 3:
                                        operations.showBalance();
                                        break;
                                case 4:
                                        operations.deposit();
                                        break;
                                case 5:
                                        operations.withdraw();
                                        break;
                                case 6:
                                        operations.calculateInterest();
                                        break;
                        }
                        System.out.println("continue ?(y/n)");
                        char ch = sc.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                                break;
                        } else {
                                continue;
                        }
                }
        }
}
