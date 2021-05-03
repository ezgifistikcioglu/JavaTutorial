package com.interfaceSample;

public class OracleDbManager implements ICustomerManager {
    @Override
    public void addCustomer() {
        System.out.println("Oracle database data has been added.");
    }
}
