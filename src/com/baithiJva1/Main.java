package com.baithiJva1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.input();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to deposit or withdraw money? (0: Deposit, 1: Withdraw): ");
        int type = scanner.nextInt();
        while(!(type == 0 || type == 1)) {
            System.out.println("Invalid transaction type. Please try again.");
            System.out.print("Do you want to deposit or withdraw money? (0: Deposit, 1: Withdraw): ");
            type = scanner.nextInt();
        }
        System.out.print("Enter amount of money: ");
        long money = scanner.nextLong();
        while(money < 0) {
            System.out.println("Invalid amount of money. Please try again.");
            System.out.print("Enter amount of money: ");
            money = scanner.nextLong();
        }
        account.depositAndWithdraw(money, type);

        System.out.print("Account details: ");
        System.out.println(account.toString());
    }
}
