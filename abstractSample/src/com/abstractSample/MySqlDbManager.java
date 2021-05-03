package com.abstractSample;

public class MySqlDbManager extends BaseDbManager{
    @Override
    public void getData() {
        System.out.println("MySQL database data has been fetched.");
    }
}
