package com.interfaceSample;

public class MySqlDbManager implements ICustomerManager {
    @Override
    public void addCustomer() {
        System.out.println("MySQL database data has been added.");
    }
}
