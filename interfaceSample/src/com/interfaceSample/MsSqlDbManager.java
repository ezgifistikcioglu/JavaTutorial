package com.interfaceSample;

public class MsSqlDbManager implements ICustomerManager {
    @Override
    public void addCustomer() {
        System.out.println("MsSQL database data has been added.");
    }
}
