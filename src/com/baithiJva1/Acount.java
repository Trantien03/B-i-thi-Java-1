package com.baithiJva1;


import java.util.Scanner;

public class Acount {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Acount() {
        this.customerCode = getCustomerCode();
        this.customerName = getCustomerName();
        this.accNumber = getAccNumber();
        this.amount = getAmount();
    }
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer code (5 characters): ");
        String code = scanner.nextLine().trim();
        while (code.length() != 5) {
            System.out.println("Invalid customer code (must be 5 characters). Please try again.");
            System.out.print("Enter customer code (5 characters): ");
            code = scanner.nextLine().trim();
        }
        this.customerCode = code;

        System.out.print("Enter account number (6 digits starting with 100):");
        String account = scanner.nextLine().trim();
        boolean validAccount = false;
        while (!validAccount) {
            if (account.length() != 6 || !account.startsWith("100")) {
                System.out.println("Invalid account number (must be 6 digits starting with 100). Please try again.");
                System.out.print("Enter account number (6 digits starting with 100):");
                account = scanner.nextLine().trim();
            } else {
                validAccount = true;
            }
        }
        this.accNumber = Integer.parseInt(account);

        System.out.print("Enter customer name:");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.println("Invalid customer name. Please try again.");
            System.out.print("Enter customer name:");
            name = scanner.nextLine().trim();
        }
        this.customerName = name;
    }
    public void depositAndWithdraw(long money, int type) {
        if (type == 0) {
            if (money > 0) {
                this.amount += money;
                System.out.println("$" + money + "  has been deposited into your account.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        } else if (type == 1) {
            if (money <= this.amount && money > 0) {
                this.amount -= money;
                System.out.println("$" + money + "  has been deposited into your account.");
            } else {
                System.out.println("Non-sufficient funds or invalid withdrawal amount.");
            }
        }
    }
    @Override
    public String toString() {
        return customerCode + " " + customerName + " " + accNumber + " $" + amount;
    }
}
