package com.company;

public class Account {
    private int AccountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposite(double depositAmount)
    {
        this.balance += depositAmount;
    }
    public void withdrawl(double withdrawlAmount)
    {
        if(balance - withdrawlAmount < 0 )
            System.out.println("No enough money");
        else
        {
            balance -= withdrawlAmount;
            System.out.println("withdrawal of amount" + withdrawlAmount + "Remaining amount : " + this.balance);
        }

    }
    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }




}
