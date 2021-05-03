package com.interfaceSample;

public class CustomerManager {
    private ICustomerManager customerManager;

    public CustomerManager(ICustomerManager customerManager){
        this.customerManager = customerManager;
    }

    public void addCustomerData(){
        customerManager.addCustomer();
    }
}
