package com.java.banksySytem;

public class Bill {
    int billId;
    int ammount;

    public Bill(int billId, int ammount) {
        this.billId = billId;
        this.ammount = ammount;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
