package com.java.banksySytem;

public class Operations {
    public static void add(Bill bill, Integer addSum) {
        int newSum = bill.getAmmount() + addSum;
        bill.setAmmount(newSum);
    }

    public static void transactionAllMoney(Bill billPersone1, Bill billPersone2) {
        int newTransactionSum = billPersone1.getAmmount() + billPersone2.getAmmount();
        billPersone2.setAmmount(newTransactionSum);
        billPersone1.setAmmount(0);
    }

    public static void transaction(Bill billPersone1, Bill billPersone2, int fuck) {
        int newTransactionSumFuck = billPersone2.getAmmount() + fuck;
        billPersone2.setAmmount(newTransactionSumFuck);
        billPersone1.setAmmount(billPersone1.ammount - fuck);
    }

    public static void transactioByName(String string1, String string2, int ammount, Persone[] persones) {
        for (int i = 0; i < persones.length; i++) {
            // if ();

        }

    }
}
