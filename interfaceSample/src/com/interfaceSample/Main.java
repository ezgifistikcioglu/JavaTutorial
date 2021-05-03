package com.interfaceSample;

public class Main {

    public static void main(String[] args) {
        ICustomerManager customerManager = new OracleDbManager();
        customerManager.addCustomer();
    }
}
