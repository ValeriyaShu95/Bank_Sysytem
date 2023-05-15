package com.java.banksySytem;

import java.util.ArrayList;

public class Persone {
    private int id;
    private String name;
    ArrayList<Bill> arrayBills = new ArrayList<>();
    public Bill[] bills;
    Bill mainBill;


    public Persone(int id, String name, Bill[] bills) {
        this.id = id;
        this.name = name;
        this.bills = bills;
//        выбрать основной
        int extraMainBillId = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i].getBillId() > extraMainBillId) {
                extraMainBillId = bills[i].getBillId();
                mainBill = bills[i];
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

    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }

    public void newBill(Bill bill) {
        this.arrayBills.add(bill);


    }
}
