package com.java.banksySytem;

import java.util.ArrayList;

public class Persone {
    private int id;
    private String name;
    ArrayList<Bill> bills;
    Bill mainBill;


    public Persone(int id, String name, ArrayList<Bill> bills) {
        this.id = id;
        this.name = name;
        this.bills = bills;
        choosMainBill(bills);
    }

    //        выбрать основной
    public void choosMainBill(ArrayList<Bill> bills) {
        int extraMainBillId = 0;

        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getBillId() > extraMainBillId) {
                extraMainBillId = bills.get(i).getBillId();
                mainBill = bills.get(i);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public void newBill(Bill bill) {
        this.bills.add(bill);
        choosMainBill(bills);
    }
}
