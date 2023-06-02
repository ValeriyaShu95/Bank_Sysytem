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

    public static void transaction3ByArray(String nameByPersone1, String nameByPersone2,
                                           int ammount, Persone[] persones) {
        Persone extraPersone1 = null;
        Persone extraPersone2 = null;
        for (int i = 0; i < persones.length; i++) {
            if (nameByPersone1.equals(persones[i].getName())) {
                extraPersone1 = persones[i];
            }
        }
        for (int i = 0; i < persones.length; i++) {
            if (nameByPersone2.equals(persones[i].getName())) {
                extraPersone2 = persones[i];
            }
        }
        int extraBillId1 = 0;
        Bill extraBill1 = null;// просто счет, факт существования счета у человека
        for (int i = 0; i < extraPersone1.bills.size(); i++) {
            if ((extraPersone1.bills.get(i).getBillId() > extraBillId1) && (extraPersone1.bills.get(i).getAmmount() > ammount)) {
                extraBillId1 = extraPersone1.bills.get(i).getBillId();
                extraBill1 = extraPersone1.bills.get(i);
            }
        }

        int extraBillId2 = 0;
        Bill extraBill2 = null;
        for (int i = 0; i < extraPersone2.bills.size(); i++) {
            if (extraPersone2.bills.get(i).getBillId() > extraBillId2) {
                extraBillId2 = extraPersone2.bills.get(i).getBillId();
                extraBill2 = extraPersone2.bills.get(i);
            }

        }
        if (extraBill1.getAmmount() < ammount) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            int sum2 = extraBill2.getAmmount() + ammount;
            int sum1 = extraBill1.getAmmount() - ammount;
            extraBill1.setAmmount(sum1);
            extraBill2.setAmmount(sum2);
        }

    }

    public static void transaction4(Persone persone1, Persone persone2, int ammount) {
        int finalSumPersone1 = 0;
        int finalSumPersone2 = 0;
        Bill extraBill1 = persone1.mainBill;
        Bill extraBill2 = persone2.mainBill;


        finalSumPersone1 = extraBill1.getAmmount() - ammount;
        finalSumPersone2 = extraBill2.getAmmount() + ammount;
        if (extraBill1.getAmmount() < ammount) {
            System.out.println("На вашем счете недостаточно средств");
        } else {
            extraBill1.setAmmount(finalSumPersone1);
            extraBill2.setAmmount(finalSumPersone2);


        }
    }
}
